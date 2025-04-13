package com.fasterxml.jackson.core.format;

import androidx.emoji2.text.flatbuffer.C0321a;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.format.InputAccessor;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

/* loaded from: classes.dex */
public class DataFormatDetector {
    public static final int DEFAULT_MAX_INPUT_LOOKAHEAD = 64;
    public final JsonFactory[] _detectors;
    public final int _maxInputLookahead;
    public final MatchStrength _minimalMatch;
    public final MatchStrength _optimalMatch;

    public DataFormatDetector(JsonFactory... jsonFactoryArr) {
        this(jsonFactoryArr, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
    }

    private DataFormatMatcher _findFormat(InputAccessor.Std std) throws IOException {
        JsonFactory[] jsonFactoryArr = this._detectors;
        int length = jsonFactoryArr.length;
        JsonFactory jsonFactory = null;
        MatchStrength matchStrength = null;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            JsonFactory jsonFactory2 = jsonFactoryArr[i2];
            std.reset();
            MatchStrength hasFormat = jsonFactory2.hasFormat(std);
            if (hasFormat != null && hasFormat.ordinal() >= this._minimalMatch.ordinal() && (jsonFactory == null || matchStrength.ordinal() < hasFormat.ordinal())) {
                if (hasFormat.ordinal() >= this._optimalMatch.ordinal()) {
                    jsonFactory = jsonFactory2;
                    matchStrength = hasFormat;
                    break;
                }
                jsonFactory = jsonFactory2;
                matchStrength = hasFormat;
            }
            i2++;
        }
        return std.createMatcher(jsonFactory, matchStrength);
    }

    public DataFormatMatcher findFormat(InputStream inputStream) throws IOException {
        return _findFormat(new InputAccessor.Std(inputStream, new byte[this._maxInputLookahead]));
    }

    public String toString() {
        StringBuilder m2872a = C0321a.m2872a('[');
        JsonFactory[] jsonFactoryArr = this._detectors;
        int length = jsonFactoryArr.length;
        if (length > 0) {
            m2872a.append(jsonFactoryArr[0].getFormatName());
            for (int i2 = 1; i2 < length; i2++) {
                m2872a.append(", ");
                m2872a.append(this._detectors[i2].getFormatName());
            }
        }
        m2872a.append(']');
        return m2872a.toString();
    }

    public DataFormatDetector withMaxInputLookahead(int i2) {
        return i2 == this._maxInputLookahead ? this : new DataFormatDetector(this._detectors, this._optimalMatch, this._minimalMatch, i2);
    }

    public DataFormatDetector withMinimalMatch(MatchStrength matchStrength) {
        return matchStrength == this._minimalMatch ? this : new DataFormatDetector(this._detectors, this._optimalMatch, matchStrength, this._maxInputLookahead);
    }

    public DataFormatDetector withOptimalMatch(MatchStrength matchStrength) {
        return matchStrength == this._optimalMatch ? this : new DataFormatDetector(this._detectors, matchStrength, this._minimalMatch, this._maxInputLookahead);
    }

    public DataFormatDetector(Collection<JsonFactory> collection) {
        this((JsonFactory[]) collection.toArray(new JsonFactory[collection.size()]));
    }

    public DataFormatMatcher findFormat(byte[] bArr) throws IOException {
        return _findFormat(new InputAccessor.Std(bArr));
    }

    private DataFormatDetector(JsonFactory[] jsonFactoryArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i2) {
        this._detectors = jsonFactoryArr;
        this._optimalMatch = matchStrength;
        this._minimalMatch = matchStrength2;
        this._maxInputLookahead = i2;
    }

    public DataFormatMatcher findFormat(byte[] bArr, int i2, int i3) throws IOException {
        return _findFormat(new InputAccessor.Std(bArr, i2, i3));
    }
}
