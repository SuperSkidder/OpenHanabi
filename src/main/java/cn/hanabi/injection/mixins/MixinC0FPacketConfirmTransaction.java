package cn.hanabi.injection.mixins;

import cn.hanabi.injection.interfaces.IC0FPacketConfirmTransaction;
import net.minecraft.network.play.client.C0FPacketConfirmTransaction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(C0FPacketConfirmTransaction.class)
public class MixinC0FPacketConfirmTransaction implements IC0FPacketConfirmTransaction {
    @Shadow
    private int windowId;
    @Shadow
    private short uid;
    @Shadow
    private boolean accepted;

    @Override
    public void setwindowId(int b) {
        windowId = b;
    }

    @Override
    public int getwindowID() {
        return windowId;
    }

    @Override
    public short getUid() {
        return uid;
    }

    @Override
    public void setUid(short b) {
        uid = b;
    }

    @Override
    public boolean getAccepted() {
        return accepted;
    }

    @Override
    public void setAccepted(boolean b) {
        accepted = b;
    }
}
