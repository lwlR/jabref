package org.jabref.logic.util;

import java.util.Locale;

/**
 * Operating system (OS) detection
 *
 * For OS-specific actions see {@link org.jabref.gui.desktop.JabRefDesktop} and {@link org.jabref.gui.desktop.os.NativeDesktop}.
 */
public class OS {
    public static final String NEWLINE = System.lineSeparator();

    public static final String APP_DIR_APP_NAME = "jabref";
    public static final String APP_DIR_APP_AUTHOR = "org.jabref";

    // https://commons.apache.org/proper/commons-lang/javadocs/api-2.6/org/apache/commons/lang/SystemUtils.html
    private static final String OS_NAME = System.getProperty("os.name", "unknown").toLowerCase(Locale.ROOT);
    public static final boolean LINUX = OS_NAME.startsWith("linux");
    public static final boolean WINDOWS = OS_NAME.startsWith("win");

    public static final boolean OS_X = OS_NAME.startsWith("mac");

    private OS() {
    }
}
