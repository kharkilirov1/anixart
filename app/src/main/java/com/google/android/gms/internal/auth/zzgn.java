package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
final class zzgn {
    /* renamed from: a */
    public static String m8483a(zzeb zzebVar) {
        StringBuilder sb = new StringBuilder(zzebVar.mo8371d());
        for (int i2 = 0; i2 < zzebVar.mo8371d(); i2++) {
            byte mo8369a = zzebVar.mo8369a(i2);
            if (mo8369a == 34) {
                sb.append("\\\"");
            } else if (mo8369a == 39) {
                sb.append("\\'");
            } else if (mo8369a != 92) {
                switch (mo8369a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (mo8369a < 32 || mo8369a > 126) {
                            sb.append('\\');
                            sb.append((char) (((mo8369a >>> 6) & 3) + 48));
                            sb.append((char) (((mo8369a >>> 3) & 7) + 48));
                            sb.append((char) ((mo8369a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) mo8369a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
