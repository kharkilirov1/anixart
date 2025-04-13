package org.jsoup.parser;

import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class ParseError {

    /* renamed from: a */
    public String f69115a;

    /* renamed from: b */
    public String f69116b;

    public ParseError(CharacterReader characterReader, String str) {
        Objects.requireNonNull(characterReader);
        this.f69115a = characterReader.m34819o();
        this.f69116b = str;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("<");
        m24u.append(this.f69115a);
        m24u.append(">: ");
        m24u.append(this.f69116b);
        return m24u.toString();
    }

    public ParseError(CharacterReader characterReader, String str, Object... objArr) {
        Objects.requireNonNull(characterReader);
        this.f69115a = characterReader.m34819o();
        this.f69116b = String.format(str, objArr);
    }
}
