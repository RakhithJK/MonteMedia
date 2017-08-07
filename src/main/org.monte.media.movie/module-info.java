/* @(#)module-info.java
 * Copyright © 2007 Werner Randelshofer, Switzerland.
 * You may only use this software in accordance with the license terms.
 */

module org.monte.media.movie {
    requires transitive java.desktop;
    
    requires transitive org.monte.media.player;
    
    exports org.monte.media.movie;
    exports org.monte.media.movie.gui;
}
