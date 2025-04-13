package com.google.protobuf;

/* loaded from: classes2.dex */
final class TextFormatEscaper {

    /* renamed from: com.google.protobuf.TextFormatEscaper$2 */
    final class C24012 implements ByteSequence {
    }

    public interface ByteSequence {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.TextFormatEscaper$1] */
    /* renamed from: a */
    public static String m13637a(final ByteString byteString) {
        ?? r0 = new ByteSequence() { // from class: com.google.protobuf.TextFormatEscaper.1
            /* renamed from: a */
            public byte m13638a(int i2) {
                return ByteString.this.mo13159d(i2);
            }

            /* renamed from: b */
            public int m13639b() {
                return ByteString.this.size();
            }
        };
        StringBuilder sb = new StringBuilder(r0.m13639b());
        for (int i2 = 0; i2 < r0.m13639b(); i2++) {
            byte m13638a = r0.m13638a(i2);
            if (m13638a == 34) {
                sb.append("\\\"");
            } else if (m13638a == 39) {
                sb.append("\\'");
            } else if (m13638a != 92) {
                switch (m13638a) {
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
                        if (m13638a < 32 || m13638a > 126) {
                            sb.append('\\');
                            sb.append((char) (((m13638a >>> 6) & 3) + 48));
                            sb.append((char) (((m13638a >>> 3) & 7) + 48));
                            sb.append((char) ((m13638a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) m13638a);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
