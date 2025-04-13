package androidx.constraintlayout.core.parser;

import p000a.C0000a;

/* loaded from: classes.dex */
public class CLElement {
    public String toString() {
        int i2 = (int) 0;
        String substring = new String((char[]) null).substring(i2, i2 + 1);
        StringBuilder sb = new StringBuilder();
        String cls = getClass().toString();
        sb.append(cls.substring(cls.lastIndexOf(46) + 1));
        sb.append(" (");
        sb.append(0L);
        sb.append(" : ");
        sb.append(0L);
        sb.append(") <<");
        return C0000a.m20q(sb, substring, ">>");
    }
}
