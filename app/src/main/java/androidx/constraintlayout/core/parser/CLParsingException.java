package androidx.constraintlayout.core.parser;

import p000a.C0000a;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {
    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CLParsingException (");
        m24u.append(hashCode());
        m24u.append(") : ");
        m24u.append("null (null at line 0)");
        return m24u.toString();
    }
}
