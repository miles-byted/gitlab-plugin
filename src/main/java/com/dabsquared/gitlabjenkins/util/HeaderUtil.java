package com.dabsquared.gitlabjenkins.util;

import org.kohsuke.stapler.StaplerRequest2;

public class HeaderUtil {

    private static final String[] PREFIXES = {"X-Gitlab-", "X-Vecode-"};

    public static String getHeader(StaplerRequest2 request, String suffix) {
        for (String prefix : PREFIXES) {
            String header = request.getHeader(prefix + suffix);
            if (header != null) {
                return header;
            }
        }
        return null;
    }
}
