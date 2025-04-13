package org.jsoup.parser;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ParseErrorList extends ArrayList<ParseError> {

    /* renamed from: b */
    public final int f69117b;

    public ParseErrorList(int i2, int i3) {
        super(i2);
        this.f69117b = i3;
    }

    /* renamed from: b */
    public boolean m34885b() {
        return size() < this.f69117b;
    }

    @Override // java.util.ArrayList
    public Object clone() {
        return super.clone();
    }
}
