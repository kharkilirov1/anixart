package com.google.gson.internal;

/* loaded from: classes2.dex */
public final class JavaVersion {

    /* renamed from: a */
    public static final int f23703a;

    static {
        int i2;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]");
            i2 = Integer.parseInt(split[0]);
            if (i2 == 1 && split.length > 1) {
                i2 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i2 = -1;
        }
        if (i2 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < property.length(); i3++) {
                    char charAt = property.charAt(i3);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i2 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            i2 = 6;
        }
        f23703a = i2;
    }
}
