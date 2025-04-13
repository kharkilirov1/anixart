package com.google.android.gms.internal.p041firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
final class zzacd {
    /* renamed from: a */
    public static String m8740a(zzyu zzyuVar) {
        StringBuilder sb = new StringBuilder(zzyuVar.mo9513d());
        for (int i2 = 0; i2 < zzyuVar.mo9513d(); i2++) {
            byte mo9511a = zzyuVar.mo9511a(i2);
            if (mo9511a == 34) {
                sb.append("\\\"");
            } else if (mo9511a == 39) {
                sb.append("\\'");
            } else if (mo9511a != 92) {
                switch (mo9511a) {
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
                        if (mo9511a < 32 || mo9511a > 126) {
                            sb.append('\\');
                            sb.append((char) (((mo9511a >>> 6) & 3) + 48));
                            sb.append((char) (((mo9511a >>> 3) & 7) + 48));
                            sb.append((char) ((mo9511a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) mo9511a);
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
