package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.p006io.MergedStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class DataFormatMatcher {
    public final byte[] _bufferedData;
    public final int _bufferedLength;
    public final int _bufferedStart;
    public final JsonFactory _match;
    public final MatchStrength _matchStrength;
    public final InputStream _originalStream;

    public DataFormatMatcher(InputStream inputStream, byte[] bArr, int i2, int i3, JsonFactory jsonFactory, MatchStrength matchStrength) {
        this._originalStream = inputStream;
        this._bufferedData = bArr;
        this._bufferedStart = i2;
        this._bufferedLength = i3;
        this._match = jsonFactory;
        this._matchStrength = matchStrength;
        if ((i2 | i3) < 0 || i2 + i3 > bArr.length) {
            throw new IllegalArgumentException(String.format("Illegal start/length (%d/%d) wrt input array of %d bytes", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(bArr.length)));
        }
    }

    public JsonParser createParserWithMatch() throws IOException {
        JsonFactory jsonFactory = this._match;
        if (jsonFactory == null) {
            return null;
        }
        return this._originalStream == null ? jsonFactory.createParser(this._bufferedData, this._bufferedStart, this._bufferedLength) : jsonFactory.createParser(getDataStream());
    }

    public InputStream getDataStream() {
        return this._originalStream == null ? new ByteArrayInputStream(this._bufferedData, this._bufferedStart, this._bufferedLength) : new MergedStream(null, this._originalStream, this._bufferedData, this._bufferedStart, this._bufferedLength);
    }

    public JsonFactory getMatch() {
        return this._match;
    }

    public MatchStrength getMatchStrength() {
        MatchStrength matchStrength = this._matchStrength;
        return matchStrength == null ? MatchStrength.INCONCLUSIVE : matchStrength;
    }

    public String getMatchedFormatName() {
        return this._match.getFormatName();
    }

    public boolean hasMatch() {
        return this._match != null;
    }
}
