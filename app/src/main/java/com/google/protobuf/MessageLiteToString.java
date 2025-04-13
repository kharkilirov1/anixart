package com.google.protobuf;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.protobuf.ByteString;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class MessageLiteToString {
    /* renamed from: a */
    public static final String m13504a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m13505b(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m13505b(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m13505b(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            ByteString byteString = ByteString.f23981c;
            sb.append(TextFormatEscaper.m13637a(new ByteString.LiteralByteString(((String) obj).getBytes(Internal.f24211b))));
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(TextFormatEscaper.m13637a((ByteString) obj));
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            m13506c((GeneratedMessageLite) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        m13505b(sb, i5, "key", entry.getKey());
        m13505b(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cd, code lost:
    
        if (((java.lang.Integer) r4).intValue() == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0229, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01df, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r4).floatValue()) == 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f5, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r4).doubleValue()) == 0) goto L87;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m13506c(com.google.protobuf.MessageLite r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MessageLiteToString.m13506c(com.google.protobuf.MessageLite, java.lang.StringBuilder, int):void");
    }
}
