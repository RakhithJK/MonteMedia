/* @(#)module-info.java
 * Copyright © 2007 Werner Randelshofer, Switzerland.
 * You may only use this software in accordance with the license terms.
 */

module org.monte.media.amiga {
    requires java.desktop;
    
    requires transitive org.monte.media.iff;
    requires transitive org.monte.media.codec;
    requires transitive org.monte.media.player;
    
    exports org.monte.media.bitmap;
    exports org.monte.media.anim;
    exports org.monte.media.eightsvx;
    exports org.monte.media.ilbm;
    exports org.monte.media.pbm;
    exports org.monte.media.seq;
}
