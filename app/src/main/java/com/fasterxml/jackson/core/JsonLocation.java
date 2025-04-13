package com.fasterxml.jackson.core;

import java.io.Serializable;
import p000a.C0000a;

/* loaded from: classes.dex */
public class JsonLocation implements Serializable {
    public static final int MAX_CONTENT_SNIPPET = 500;

    /* renamed from: NA */
    public static final JsonLocation f8863NA = new JsonLocation(null, -1, -1, -1, -1);
    private static final long serialVersionUID = 1;
    public final int _columnNr;
    public final int _lineNr;
    public final transient Object _sourceRef;
    public final long _totalBytes;
    public final long _totalChars;

    public JsonLocation(Object obj, long j2, int i2, int i3) {
        this(obj, -1L, j2, i2, i3);
    }

    private int _append(StringBuilder sb, String str) {
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        sb.append(str);
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        return str.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.StringBuilder _appendSourceDesc(java.lang.StringBuilder r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6._sourceRef
            if (r0 != 0) goto La
            java.lang.String r0 = "UNKNOWN"
            r7.append(r0)
            return r7
        La:
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L12
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            goto L16
        L12:
            java.lang.Class r1 = r0.getClass()
        L16:
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "java."
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L27
            java.lang.String r2 = r1.getSimpleName()
            goto L34
        L27:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L2e
            java.lang.String r2 = "byte[]"
            goto L34
        L2e:
            boolean r1 = r0 instanceof char[]
            if (r1 == 0) goto L34
            java.lang.String r2 = "char[]"
        L34:
            r1 = 40
            r7.append(r1)
            r7.append(r2)
            r1 = 41
            r7.append(r1)
            boolean r1 = r0 instanceof java.lang.CharSequence
            r2 = 500(0x1f4, float:7.0E-43)
            r3 = 0
            java.lang.String r4 = " chars"
            if (r1 == 0) goto L63
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r0.length()
            int r2 = java.lang.Math.min(r1, r2)
            java.lang.CharSequence r0 = r0.subSequence(r3, r2)
            java.lang.String r0 = r0.toString()
            int r0 = r6._append(r7, r0)
        L60:
            int r3 = r1 - r0
            goto L96
        L63:
            boolean r1 = r0 instanceof char[]
            if (r1 == 0) goto L78
            char[] r0 = (char[]) r0
            int r1 = r0.length
            java.lang.String r5 = new java.lang.String
            int r2 = java.lang.Math.min(r1, r2)
            r5.<init>(r0, r3, r2)
            int r0 = r6._append(r7, r5)
            goto L60
        L78:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L96
            byte[] r0 = (byte[]) r0
            int r1 = r0.length
            int r1 = java.lang.Math.min(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r2.<init>(r0, r3, r1, r4)
            r6._append(r7, r2)
            int r0 = r0.length
            int r3 = r0 - r1
            java.lang.String r4 = " bytes"
        L96:
            if (r3 <= 0) goto La8
            java.lang.String r0 = "[truncated "
            r7.append(r0)
            r7.append(r3)
            r7.append(r4)
            r0 = 93
            r7.append(r0)
        La8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonLocation._appendSourceDesc(java.lang.StringBuilder):java.lang.StringBuilder");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        Object obj2 = this._sourceRef;
        if (obj2 == null) {
            if (jsonLocation._sourceRef != null) {
                return false;
            }
        } else if (!obj2.equals(jsonLocation._sourceRef)) {
            return false;
        }
        return this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && getByteOffset() == jsonLocation.getByteOffset();
    }

    public long getByteOffset() {
        return this._totalBytes;
    }

    public long getCharOffset() {
        return this._totalChars;
    }

    public int getColumnNr() {
        return this._columnNr;
    }

    public int getLineNr() {
        return this._lineNr;
    }

    public Object getSourceRef() {
        return this._sourceRef;
    }

    public int hashCode() {
        Object obj = this._sourceRef;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public String sourceDescription() {
        return _appendSourceDesc(new StringBuilder(100)).toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        _appendSourceDesc(sb);
        sb.append("; line: ");
        sb.append(this._lineNr);
        sb.append(", column: ");
        return C0000a.m17n(sb, this._columnNr, ']');
    }

    public JsonLocation(Object obj, long j2, long j3, int i2, int i3) {
        this._sourceRef = obj;
        this._totalBytes = j2;
        this._totalChars = j3;
        this._lineNr = i2;
        this._columnNr = i3;
    }
}
