/* @(#)module-info.java
 * Copyright © 2017 Werner Randelshofer, Switzerland. MIT License.
 */

/**
 * Movie maker demo.
 * 
 * @author Werner Randelshofer
 * @version $Id$
 */
module org.monte.demo.moviemaker {
    requires java.desktop;
    requires java.prefs;
    
    requires org.monte.media;    
    
    exports org.monte.demo.moviemaker;    
}
