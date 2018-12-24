/* @(#)module-info.java
 * Copyright © 2017 Werner Randelshofer, Switzerland. MIT License.
 */

/**
 * MPO image splitter demo.
 * 
 * @author Werner Randelshofer
 * @version $Id$
 */
module org.monte.demo.mpoimagesplitter {
    requires java.desktop;
    
    requires org.monte.media;    
    
    exports org.monte.demo.mpoimagesplitter;
}
