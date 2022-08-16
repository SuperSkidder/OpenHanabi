package cn.hanabi.utils.fontmanager;

import cn.hanabi.gui.font.VertexFontRenderer;
import cn.hanabi.gui.font.compat.WrappedVertexFontRenderer;
import me.yarukon.font.FontUtils;
import me.yarukon.font.GlyphPageFontRenderer;

import java.awt.*;
import java.io.InputStream;
import java.util.HashMap;

public class FontManager {
    private final HashMap<String, VertexFontRenderer> fonts = new HashMap<>();

    public WrappedVertexFontRenderer comfortaa10;
    public WrappedVertexFontRenderer comfortaa11;
    public WrappedVertexFontRenderer comfortaa12;
    public WrappedVertexFontRenderer comfortaa13;
    public WrappedVertexFontRenderer comfortaa15;
    public WrappedVertexFontRenderer comfortaa16;
    public WrappedVertexFontRenderer comfortaa17;
    public WrappedVertexFontRenderer comfortaa18;
    public WrappedVertexFontRenderer comfortaa20;
    public WrappedVertexFontRenderer comfortaa22;
    public WrappedVertexFontRenderer comfortaa25;
    public WrappedVertexFontRenderer comfortaa28;
    public WrappedVertexFontRenderer comfortaa30;
    public WrappedVertexFontRenderer comfortaa35;
    public WrappedVertexFontRenderer comfortaa40;
    public WrappedVertexFontRenderer comfortaa45;
    public WrappedVertexFontRenderer comfortaa50;
    public WrappedVertexFontRenderer comfortaa70;
    public WrappedVertexFontRenderer comfortaa150;

    public WrappedVertexFontRenderer raleway10;
    public WrappedVertexFontRenderer raleway11;
    public WrappedVertexFontRenderer raleway12;
    public WrappedVertexFontRenderer raleway13;
    public WrappedVertexFontRenderer raleway15;
    public WrappedVertexFontRenderer raleway16;
    public WrappedVertexFontRenderer raleway17;
    public WrappedVertexFontRenderer raleway18;
    public WrappedVertexFontRenderer raleway20;
    public WrappedVertexFontRenderer raleway25;
    public WrappedVertexFontRenderer raleway30;
    public WrappedVertexFontRenderer raleway35;
    public WrappedVertexFontRenderer raleway40;
    public WrappedVertexFontRenderer raleway45;
    public WrappedVertexFontRenderer raleway50;
    public WrappedVertexFontRenderer raleway70;

    public WrappedVertexFontRenderer usans10;
    public WrappedVertexFontRenderer usans11;
    public WrappedVertexFontRenderer usans12;
    public WrappedVertexFontRenderer usans13;
    public WrappedVertexFontRenderer usans14;
    public WrappedVertexFontRenderer usans15;
    public WrappedVertexFontRenderer usans16;
    public WrappedVertexFontRenderer usans17;
    public WrappedVertexFontRenderer usans18;
    public WrappedVertexFontRenderer usans19;
    public WrappedVertexFontRenderer usans20;
    public WrappedVertexFontRenderer usans21;
    public WrappedVertexFontRenderer usans22;
    public WrappedVertexFontRenderer usans23;
    public WrappedVertexFontRenderer usans24;
    public WrappedVertexFontRenderer usans25;
    public WrappedVertexFontRenderer usans28;
    public WrappedVertexFontRenderer usans30;
    public WrappedVertexFontRenderer usans35;
    public WrappedVertexFontRenderer usans40;
    public WrappedVertexFontRenderer usans45;
    public WrappedVertexFontRenderer usans50;
    public WrappedVertexFontRenderer usans70;
    public WrappedVertexFontRenderer usans150;

    public WrappedVertexFontRenderer icon10;
    public WrappedVertexFontRenderer icon11;
    public WrappedVertexFontRenderer icon12;
    public WrappedVertexFontRenderer icon13;
    public WrappedVertexFontRenderer icon14;
    public WrappedVertexFontRenderer icon15;
    public WrappedVertexFontRenderer icon16;
    public WrappedVertexFontRenderer icon17;
    public WrappedVertexFontRenderer icon18;
    public WrappedVertexFontRenderer icon19;
    public WrappedVertexFontRenderer icon20;
    public WrappedVertexFontRenderer icon21;
    public WrappedVertexFontRenderer icon22;
    public WrappedVertexFontRenderer icon23;
    public WrappedVertexFontRenderer icon24;
    public WrappedVertexFontRenderer icon25;
    public WrappedVertexFontRenderer icon30;
    public WrappedVertexFontRenderer icon35;
    public WrappedVertexFontRenderer icon40;
    public WrappedVertexFontRenderer icon45;
    public WrappedVertexFontRenderer icon50;
    public WrappedVertexFontRenderer icon70;
    public WrappedVertexFontRenderer icon100;
    public WrappedVertexFontRenderer icon130;


    public WrappedVertexFontRenderer sessionInfoIcon10;
    public WrappedVertexFontRenderer sessionInfoIcon11;
    public WrappedVertexFontRenderer sessionInfoIcon12;
    public WrappedVertexFontRenderer sessionInfoIcon13;
    public WrappedVertexFontRenderer sessionInfoIcon14;
    public WrappedVertexFontRenderer sessionInfoIcon15;
    public WrappedVertexFontRenderer sessionInfoIcon16;
    public WrappedVertexFontRenderer sessionInfoIcon17;
    public WrappedVertexFontRenderer sessionInfoIcon18;
    public WrappedVertexFontRenderer sessionInfoIcon19;
    public WrappedVertexFontRenderer sessionInfoIcon20;
    public WrappedVertexFontRenderer sessionInfoIcon21;
    public WrappedVertexFontRenderer sessionInfoIcon22;
    public WrappedVertexFontRenderer sessionInfoIcon23;
    public WrappedVertexFontRenderer sessionInfoIcon24;
    public WrappedVertexFontRenderer sessionInfoIcon25;
    public WrappedVertexFontRenderer sessionInfoIcon30;
    public WrappedVertexFontRenderer sessionInfoIcon35;

    public WrappedVertexFontRenderer altManagerIcon10;
    public WrappedVertexFontRenderer altManagerIcon11;
    public WrappedVertexFontRenderer altManagerIcon12;
    public WrappedVertexFontRenderer altManagerIcon13;
    public WrappedVertexFontRenderer altManagerIcon14;
    public WrappedVertexFontRenderer altManagerIcon15;
    public WrappedVertexFontRenderer altManagerIcon16;
    public WrappedVertexFontRenderer altManagerIcon17;
    public WrappedVertexFontRenderer altManagerIcon18;
    public WrappedVertexFontRenderer altManagerIcon19;
    public WrappedVertexFontRenderer altManagerIcon20;
    public WrappedVertexFontRenderer altManagerIcon21;
    public WrappedVertexFontRenderer altManagerIcon22;
    public WrappedVertexFontRenderer altManagerIcon23;
    public WrappedVertexFontRenderer altManagerIcon24;
    public WrappedVertexFontRenderer altManagerIcon25;
    public WrappedVertexFontRenderer altManagerIcon30;
    public WrappedVertexFontRenderer altManagerIcon35;
    public WrappedVertexFontRenderer altManagerIcon40;
    public WrappedVertexFontRenderer altManagerIcon45;
    public WrappedVertexFontRenderer altManagerIcon50;
    public WrappedVertexFontRenderer altManagerIcon70;


    public WrappedVertexFontRenderer tahoma_15;
    public WrappedVertexFontRenderer tahoma_16;
    public WrappedVertexFontRenderer tahoma_17;
    public WrappedVertexFontRenderer tahoma_18;
    public WrappedVertexFontRenderer tahoma_19;
    public WrappedVertexFontRenderer tahoma_20;

    public WrappedVertexFontRenderer tahomabd_12;
    public WrappedVertexFontRenderer tahomabd_13;
    public WrappedVertexFontRenderer tahomabd_14;
    public WrappedVertexFontRenderer tahomabd_15;

    public WrappedVertexFontRenderer tahomabd_16;
    public WrappedVertexFontRenderer tahomabd_17;
    public WrappedVertexFontRenderer tahomabd_18;
    public WrappedVertexFontRenderer tahomabd_19;
    public WrappedVertexFontRenderer tahomabd_20;

    public WrappedVertexFontRenderer micon15;
    public WrappedVertexFontRenderer micon30;

    public WrappedVertexFontRenderer wqy13;
    public WrappedVertexFontRenderer wqy16;
    public WrappedVertexFontRenderer wqy18;

    public void initFonts() {
        comfortaa10 = this.getFont("comfortaa", 10);
        comfortaa11 = this.getFont("comfortaa", 11);
        comfortaa12 = this.getFont("comfortaa", 12);
        comfortaa13 = this.getFont("comfortaa", 13);
        comfortaa15 = this.getFont("comfortaa", 15);
        comfortaa16 = this.getFont("comfortaa", 16);
        comfortaa17 = this.getFont("comfortaa", 17);
        comfortaa18 = this.getFont("comfortaa", 18);
        comfortaa20 = this.getFont("comfortaa", 20);
        comfortaa25 = this.getFont("comfortaa", 25);
        comfortaa30 = this.getFont("comfortaa", 30);
        comfortaa35 = this.getFont("comfortaa", 35);
        comfortaa40 = this.getFont("comfortaa", 40);
        comfortaa45 = this.getFont("comfortaa", 45);
        comfortaa50 = this.getFont("comfortaa", 50);
        comfortaa70 = this.getFont("comfortaa", 70);
        comfortaa150 = this.getFont("comfortaa", 140);

        raleway10 = this.getFont("raleway", 10);
        raleway11 = this.getFont("raleway", 11);
        raleway12 = this.getFont("raleway", 12);
        raleway13 = this.getFont("raleway", 13);
        raleway15 = this.getFont("raleway", 15);
        raleway16 = this.getFont("raleway", 16);
        raleway17 = this.getFont("raleway", 17);
        raleway18 = this.getFont("raleway", 18);
        raleway20 = this.getFont("raleway", 20);
        raleway25 = this.getFont("raleway", 25);
        raleway30 = this.getFont("raleway", 30);
        raleway35 = this.getFont("raleway", 35);
        raleway40 = this.getFont("raleway", 40);
        raleway45 = this.getFont("raleway", 45);
        raleway50 = this.getFont("raleway", 50);
        raleway70 = this.getFont("raleway", 70);

        usans10 = this.getFont("usans", 10, "otf");
        usans11 = this.getFont("usans", 11, "otf");
        usans12 = this.getFont("usans", 12, "otf");
        usans13 = this.getFont("usans", 13, "otf");
        usans14 = this.getFont("usans", 14, "otf");
        usans15 = this.getFont("usans", 15, "otf");
        usans16 = this.getFont("usans", 16, "otf");
        usans17 = this.getFont("usans", 17, "otf");
        usans18 = this.getFont("usans", 18, "otf");
        usans19 = this.getFont("usans", 19, "otf");
        usans20 = this.getFont("usans", 20, "otf");
        usans21 = this.getFont("usans", 21, "otf");
        usans22 = this.getFont("usans", 22, "otf");
        usans23 = this.getFont("usans", 23, "otf");
        usans24 = this.getFont("usans", 24, "otf");
        usans25 = this.getFont("usans", 25, "otf");
        usans28 = this.getFont("usans", 28, "otf");
        usans30 = this.getFont("usans", 30, "otf");
        usans35 = this.getFont("usans", 35, "otf");
        usans40 = this.getFont("usans", 40, "otf");
        usans45 = this.getFont("usans", 45, "otf");
        usans50 = this.getFont("usans", 50, "otf");
        usans70 = this.getFont("usans", 70, "otf");
        usans150 = this.getFont("usans", 150, "otf");

        this.icon10 = this.getFont("icon", 10);
        this.icon11 = this.getFont("icon", 11);
        this.icon12 = this.getFont("icon", 12);
        this.icon13 = this.getFont("icon", 13);
        this.icon14 = this.getFont("icon", 14);
        this.icon15 = this.getFont("icon", 15);
        this.icon16 = this.getFont("icon", 16);
        this.icon17 = this.getFont("icon", 17);
        this.icon18 = this.getFont("icon", 18);
        this.icon19 = this.getFont("icon", 19);
        this.icon20 = this.getFont("icon", 20);
        this.icon21 = this.getFont("icon", 21);
        this.icon22 = this.getFont("icon", 22);
        this.icon23 = this.getFont("icon", 23);
        this.icon24 = this.getFont("icon", 24);
        this.icon25 = this.getFont("icon", 25);
        this.icon30 = this.getFont("icon", 30);
        this.icon35 = this.getFont("icon", 35);
        this.icon40 = this.getFont("icon", 40);
        this.icon45 = this.getFont("icon", 45);
        this.icon50 = this.getFont("icon", 50);
        this.icon70 = this.getFont("icon", 70);
        this.icon100 = this.getFont("icon", 100);
        this.icon130 = this.getFont("icon", 130);

        sessionInfoIcon10 = this.getFont("SessIcon", 10);
        sessionInfoIcon11 = this.getFont("SessIcon", 11);
        sessionInfoIcon12 = this.getFont("SessIcon", 12);
        sessionInfoIcon13 = this.getFont("SessIcon", 13);
        sessionInfoIcon14 = this.getFont("SessIcon", 14);
        sessionInfoIcon15 = this.getFont("SessIcon", 15);
        sessionInfoIcon16 = this.getFont("SessIcon", 16);
        sessionInfoIcon17 = this.getFont("SessIcon", 17);
        sessionInfoIcon18 = this.getFont("SessIcon", 18);
        sessionInfoIcon19 = this.getFont("SessIcon", 19);
        sessionInfoIcon20 = this.getFont("SessIcon", 20);
        sessionInfoIcon21 = this.getFont("SessIcon", 21);
        sessionInfoIcon22 = this.getFont("SessIcon", 22);
        sessionInfoIcon23 = this.getFont("SessIcon", 23);
        sessionInfoIcon24 = this.getFont("SessIcon", 24);
        sessionInfoIcon25 = this.getFont("SessIcon", 25);
        sessionInfoIcon30 = this.getFont("SessIcon", 30);
        sessionInfoIcon35 = this.getFont("SessIcon", 35);

        altManagerIcon10 = this.getFont("altmanager", 10);
        altManagerIcon11 = this.getFont("altmanager", 11);
        altManagerIcon12 = this.getFont("altmanager", 12);
        altManagerIcon13 = this.getFont("altmanager", 13);
        altManagerIcon14 = this.getFont("altmanager", 14);
        altManagerIcon15 = this.getFont("altmanager", 15);
        altManagerIcon16 = this.getFont("altmanager", 16);
        altManagerIcon17 = this.getFont("altmanager", 17);
        altManagerIcon18 = this.getFont("altmanager", 18);
        altManagerIcon19 = this.getFont("altmanager", 19);
        altManagerIcon20 = this.getFont("altmanager", 20);
        altManagerIcon21 = this.getFont("altmanager", 21);
        altManagerIcon22 = this.getFont("altmanager", 22);
        altManagerIcon23 = this.getFont("altmanager", 23);
        altManagerIcon24 = this.getFont("altmanager", 24);
        altManagerIcon25 = this.getFont("altmanager", 25);
        altManagerIcon30 = this.getFont("altmanager", 30);
        altManagerIcon35 = this.getFont("altmanager", 35);
        altManagerIcon40 = this.getFont("altmanager", 40);
        altManagerIcon45 = this.getFont("altmanager", 45);
        altManagerIcon50 = this.getFont("altmanager", 50);
        altManagerIcon70 = this.getFont("altmanager", 70);

        micon15 = this.getFont("micon", 15);
        micon30 = this.getFont("micon", 30);

        wqy13 = this.getFont("wqy_microhei", 13);
        wqy16 = this.getFont("wqy_microhei", 16);
        wqy18 = this.getFont("wqy_microhei", 18);

        tahoma_15 = this.getFont("tahoma", 15);
        tahoma_16 = this.getFont("tahoma", 16);
        tahoma_17 = this.getFont("tahoma", 17);
        tahoma_18 = this.getFont("tahoma", 18);
        tahoma_19 = this.getFont("tahoma", 19);
        tahoma_20 = this.getFont("tahoma", 20);

        tahomabd_12 = this.getFont("tahomabd", 12);
        tahomabd_13 = this.getFont("tahomabd", 13);
        tahomabd_14 = this.getFont("tahomabd", 14);
        tahomabd_15 = this.getFont("tahomabd", 15);
        tahomabd_16 = this.getFont("tahomabd", 16);
        tahomabd_17 = this.getFont("tahomabd", 17);
        tahomabd_18 = this.getFont("tahomabd", 18);
        tahomabd_19 = this.getFont("tahomabd", 19);
        tahomabd_20 = this.getFont("tahomabd", 20);
    }

    public WrappedVertexFontRenderer getFont(String name, int size) {
        return getFont(name, size, "ttf");
    }


    public WrappedVertexFontRenderer getFont(String name, int size, String suffix) {
        if(!fonts.containsKey(name)) {
            Font font;
            try {
                InputStream inputStream = this.getClass()
                        .getResourceAsStream("/assets/minecraft/Client/fonts/" + name + "." + suffix);
                font = Font.createFont(Font.TRUETYPE_FONT, inputStream);
                inputStream.close();
                font = font.deriveFont(Font.PLAIN, 35);
            } catch (Exception var7) {
                var7.printStackTrace();
                font = new Font("default", Font.PLAIN, 35);
            }
            fonts.put(name, new VertexFontRenderer(font));
        }
        return new WrappedVertexFontRenderer(fonts.get(name), size);
    }
}
