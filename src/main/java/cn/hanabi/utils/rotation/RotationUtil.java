package cn.hanabi.utils.rotation;

import cn.hanabi.modules.modules.combat.KillAura;
import cn.hanabi.utils.RaycastUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import org.apache.commons.lang3.RandomUtils;


public class RotationUtil {

    private static final Minecraft mc = Minecraft.getMinecraft();
    public static float[] prevRotations = new float[2];

    public static boolean isFaced(final Entity targetEntity, double blockReachDistance, Rotation rotation) {
        return RaycastUtils.raycastEntity(blockReachDistance, rotation, entity -> entity == targetEntity) != null;
    }

    public static float[] getRotationToLocation(final Vec3 loc) {
        double xDiff = loc.xCoord - Minecraft.getMinecraft().thePlayer.posX;
        double yDiff = loc.yCoord - (Minecraft.getMinecraft().thePlayer.posY + Minecraft.getMinecraft().thePlayer.getEyeHeight());
        double zDiff = loc.zCoord - Minecraft.getMinecraft().thePlayer.posZ;

        double distance = MathHelper.sqrt_double(xDiff * xDiff + zDiff * zDiff);

        float yaw = (float) (Math.atan2(zDiff, xDiff) * 180.0D / Math.PI) - 90.0F;
        float pitch = (float) (-(Math.atan2(yDiff, distance) * 180.0D / Math.PI));

        return new float[]{yaw, pitch};
    }

    public static float[] getRotationToEntity(Entity entity) {
        double pX = Minecraft.getMinecraft().thePlayer.posX;
        double pY = Minecraft.getMinecraft().thePlayer.posY + (double) Minecraft.getMinecraft().thePlayer.getEyeHeight();
        double pZ = Minecraft.getMinecraft().thePlayer.posZ;
        double eX = entity.posX;
        double eY = entity.posY + (double) entity.getEyeHeight();
        double eZ = entity.posZ;
        double dX = pX - eX;
        double dY = pY - eY;
        double dZ = pZ - eZ;
        double dH = Math.sqrt(Math.pow(dX, 2.0D) + Math.pow(dZ, 2.0D));
        float yaw;
        float pitch;
        yaw = (float) (Math.toDegrees(Math.atan2(dZ, dX)) + 90.0D);
        pitch = (float) Math.toDegrees(Math.atan2(dH, dY));
        return new float[]{yaw, 90.0F - pitch};
    }

    //
    public static Rotation limitAngleChange(final Rotation currentRotation, final Rotation targetRotation,
                                            final float turnSpeed) {
        final float yawDifference = getAngleDifference(targetRotation.getYaw(), currentRotation.getYaw());
        final float pitchDifference = getAngleDifference(targetRotation.getPitch(), currentRotation.getPitch());

        return new Rotation(
                currentRotation.getYaw()
                        + (yawDifference > turnSpeed ? turnSpeed : Math.max(yawDifference, -turnSpeed)),
                currentRotation.getPitch()
                        + (pitchDifference > turnSpeed ? turnSpeed : Math.max(pitchDifference, -turnSpeed)));
    }

    public static Rotation convert(float[] rot) {
        return new Rotation(rot[0], rot[1]);
    }

    public static float[] convertBack(Rotation rotation) {
        return new float[]{rotation.getYaw(), rotation.getPitch()};
    }


    public static Vec3 getVectorForRotation(final Rotation rotation) {
        float yawCos = MathHelper.cos(-rotation.getYaw() * 0.017453292F - (float) Math.PI);
        float yawSin = MathHelper.sin(-rotation.getYaw() * 0.017453292F - (float) Math.PI);
        float pitchCos = -MathHelper.cos(-rotation.getPitch() * 0.017453292F);
        float pitchSin = MathHelper.sin(-rotation.getPitch() * 0.017453292F);
        return new Vec3(yawSin * pitchCos, pitchSin, yawCos * pitchCos);
    }

    public static double getRotationDifference(final Rotation a, final Rotation b) {
        return Math.hypot(getAngleDifference(a.getYaw(), b.getYaw()), a.getPitch() - b.getPitch());
    }

    public static float getRotationDifference(float current, float target) {
        return MathHelper.wrapAngleTo180_float(target - current);
    }

    private static float getAngleDifference(final float a, final float b) {
        return ((((a - b) % 360F) + 540F) % 360F) - 180F;
    }

    public static double getRotationDifference(final Rotation rotation) {
        return prevRotations == null ? 0D
                : getRotationDifference(rotation,
                new Rotation(prevRotations[0], prevRotations[1]));
    }


    public static float[] rotations(Entity target) {
        double x = target.posX - mc.thePlayer.posX;
        double z = target.posZ - mc.thePlayer.posZ;
        double y = target.posY + target.getEyeHeight() * 0.75D - (mc.thePlayer.posY + mc.thePlayer.getEyeHeight());

        double distance = MathHelper.sqrt_double(x * x + z * z);

        float yaw = (float) (Math.atan2(z, x) * 180.0D / Math.PI) - 90.0F;
        float pitch = (float) -((Math.atan2(y, distance) * 180.0D / Math.PI));
        return new float[]{yaw, pitch};
    }


    public static float[] getRotationFromPosition(double x, double z, double y) {
        double xDiff = x - Minecraft.getMinecraft().thePlayer.posX;
        double zDiff = z - Minecraft.getMinecraft().thePlayer.posZ;
        double yDiff = y - Minecraft.getMinecraft().thePlayer.posY - 1.2;
        double dist = MathHelper.sqrt_double(xDiff * xDiff + zDiff * zDiff);
        float yaw = (float) (Math.atan2(zDiff, xDiff) * 180.0 / Math.PI) - 90.0f;
        float pitch = (float) (-Math.atan2(yDiff, dist) * 180.0 / Math.PI);
        return new float[]{yaw, pitch};
    }


    public static float getNewAngle(float angle) {
        if ((angle %= 360.0f) >= 180.0f) {
            angle -= 360.0f;
        }
        if (angle < -180.0f) {
            angle += 360.0f;
        }
        return angle;
    }

    public static float getDistanceBetweenAngles(float angle1, float angle2) {
        float angle = Math.abs(angle1 - angle2) % 360.0f;
        if (angle > 180.0f) {
            angle = 360.0f - angle;
        }
        return angle;
    }


    public static float[] getNeededRotations(Vec3 vec, Vec3 transected) {
        boolean predict = KillAura.predict.getValue();
        Vec3 targetVector = new Vec3(vec.xCoord + (predict ? transected.xCoord : 0), vec.yCoord + (predict ? transected.yCoord : 0), vec.zCoord + (predict ? transected.zCoord : 0));
        Vec3 playerVector = new Vec3(mc.thePlayer.posX + mc.thePlayer.motionX * KillAura.predictor.getValue() * RandomUtils.nextFloat(0.8f, 1.2f), mc.thePlayer.getEntityBoundingBox().minY + (double) mc.thePlayer.getEyeHeight() + mc.thePlayer.motionY, mc.thePlayer.posZ + mc.thePlayer.motionZ * KillAura.predictor.getValue() * RandomUtils.nextFloat(0.8f, 1.2f));


        double y = targetVector.yCoord - playerVector.yCoord;
        double x = targetVector.xCoord - playerVector.xCoord;
        double z = targetVector.zCoord - playerVector.zCoord;

        double dff = Math.sqrt(x * x + z * z);

        float yaw = (float) Math.toDegrees(Math.atan2(z, x)) - 90.0F;
        float pitch = (float) (-Math.toDegrees(Math.atan2(y, dff)));

        return new float[]{MathHelper.wrapAngleTo180_float(yaw), MathHelper.wrapAngleTo180_float(pitch)};
    }


    public static Rotation getRotationFromEyeHasPrev(double x, double y, double z) {
        double xDiff = x - (mc.thePlayer.prevPosX + (mc.thePlayer.posX - mc.thePlayer.prevPosX));
        double yDiff = y - ((mc.thePlayer.prevPosY + (mc.thePlayer.posY - mc.thePlayer.prevPosY)) + (mc.thePlayer.getEntityBoundingBox().maxY - mc.thePlayer.getEntityBoundingBox().minY));
        double zDiff = z - (mc.thePlayer.prevPosZ + (mc.thePlayer.posZ - mc.thePlayer.prevPosZ));
        final double dist = MathHelper.sqrt_double(xDiff * xDiff + zDiff * zDiff);
        return new Rotation((float) (Math.atan2(zDiff, xDiff) * 180D / Math.PI) - 90F, (float) -(Math.atan2(yDiff, dist) * 180D / Math.PI));
    }


    public static Rotation getRotationFromEyeHasPrev(EntityLivingBase target) {
        final double x = (target.prevPosX + (target.posX - target.prevPosX));
        final double y = (target.prevPosY + (target.posY - target.prevPosY));
        final double z = (target.prevPosZ + (target.posZ - target.prevPosZ));
        return getRotationFromEyeHasPrev(x, y, z);
    }


    public static Rotation getRotationFromEyeHasPrev(Vec3 vec) {
        return getRotationFromEyeHasPrev(vec.xCoord, vec.yCoord, vec.zCoord);
    }


    public static float[] getRotations(double posX, double posY, double posZ, double eyeHeight, final BlockPos blockPos, final EnumFacing enumFacing) {
        double n = blockPos.getX() + 0.5 - posX + enumFacing.getFrontOffsetX() / 2.0;
        double n2 = blockPos.getZ() + 0.5 - posZ + enumFacing.getFrontOffsetZ() / 2.0;
        double n3 = posY + eyeHeight - (blockPos.getY() + 0.5);
        double n4 = MathHelper.sqrt_double(n * n + n2 * n2);
        float n5 = (float) (Math.atan2(n2, n) * 180.0 / 3.141592653589793) - 90.0f;
        float n6 = (float) (Math.atan2(n3, n4) * 180.0 / 3.141592653589793);
        if (n5 < 0.0f) {
            n5 += 360.0f;
        }
        return new float[]{n5, n6};
    }

}

