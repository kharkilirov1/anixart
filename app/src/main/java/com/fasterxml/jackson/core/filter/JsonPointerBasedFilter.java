package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonPointer;
import p000a.C0000a;

/* loaded from: classes.dex */
public class JsonPointerBasedFilter extends TokenFilter {
    public final JsonPointer _pathToMatch;

    public JsonPointerBasedFilter(String str) {
        this(JsonPointer.compile(str));
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public boolean _includeScalar() {
        return this._pathToMatch.matches();
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter filterStartArray() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter filterStartObject() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter includeElement(int i2) {
        JsonPointer matchElement = this._pathToMatch.matchElement(i2);
        if (matchElement == null) {
            return null;
        }
        return matchElement.matches() ? TokenFilter.INCLUDE_ALL : new JsonPointerBasedFilter(matchElement);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter includeProperty(String str) {
        JsonPointer matchProperty = this._pathToMatch.matchProperty(str);
        if (matchProperty == null) {
            return null;
        }
        return matchProperty.matches() ? TokenFilter.INCLUDE_ALL : new JsonPointerBasedFilter(matchProperty);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public String toString() {
        StringBuilder m24u = C0000a.m24u("[JsonPointerFilter at: ");
        m24u.append(this._pathToMatch);
        m24u.append("]");
        return m24u.toString();
    }

    public JsonPointerBasedFilter(JsonPointer jsonPointer) {
        this._pathToMatch = jsonPointer;
    }
}
