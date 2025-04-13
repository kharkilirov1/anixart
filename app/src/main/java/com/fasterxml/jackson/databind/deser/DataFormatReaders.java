package com.fasterxml.jackson.databind.deser;

import androidx.emoji2.text.flatbuffer.C0321a;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p006io.MergedStream;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

/* loaded from: classes.dex */
public class DataFormatReaders {
    public static final int DEFAULT_MAX_INPUT_LOOKAHEAD = 64;
    public final int _maxInputLookahead;
    public final MatchStrength _minimalMatch;
    public final MatchStrength _optimalMatch;
    public final ObjectReader[] _readers;

    public static class Match {
        public final byte[] _bufferedData;
        public final int _bufferedLength;
        public final int _bufferedStart;
        public final ObjectReader _match;
        public final MatchStrength _matchStrength;
        public final InputStream _originalStream;

        public Match(InputStream inputStream, byte[] bArr, int i2, int i3, ObjectReader objectReader, MatchStrength matchStrength) {
            this._originalStream = inputStream;
            this._bufferedData = bArr;
            this._bufferedStart = i2;
            this._bufferedLength = i3;
            this._match = objectReader;
            this._matchStrength = matchStrength;
        }

        public JsonParser createParserWithMatch() throws IOException {
            ObjectReader objectReader = this._match;
            if (objectReader == null) {
                return null;
            }
            JsonFactory factory = objectReader.getFactory();
            return this._originalStream == null ? factory.createParser(this._bufferedData, this._bufferedStart, this._bufferedLength) : factory.createParser(getDataStream());
        }

        public InputStream getDataStream() {
            return this._originalStream == null ? new ByteArrayInputStream(this._bufferedData, this._bufferedStart, this._bufferedLength) : new MergedStream(null, this._originalStream, this._bufferedData, this._bufferedStart, this._bufferedLength);
        }

        public MatchStrength getMatchStrength() {
            MatchStrength matchStrength = this._matchStrength;
            return matchStrength == null ? MatchStrength.INCONCLUSIVE : matchStrength;
        }

        public String getMatchedFormatName() {
            return this._match.getFactory().getFormatName();
        }

        public ObjectReader getReader() {
            return this._match;
        }

        public boolean hasMatch() {
            return this._match != null;
        }
    }

    public DataFormatReaders(ObjectReader... objectReaderArr) {
        this(objectReaderArr, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
    }

    private Match _findFormat(AccessorForReader accessorForReader) throws IOException {
        ObjectReader[] objectReaderArr = this._readers;
        int length = objectReaderArr.length;
        ObjectReader objectReader = null;
        MatchStrength matchStrength = null;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            ObjectReader objectReader2 = objectReaderArr[i2];
            accessorForReader.reset();
            MatchStrength hasFormat = objectReader2.getFactory().hasFormat(accessorForReader);
            if (hasFormat != null && hasFormat.ordinal() >= this._minimalMatch.ordinal() && (objectReader == null || matchStrength.ordinal() < hasFormat.ordinal())) {
                if (hasFormat.ordinal() >= this._optimalMatch.ordinal()) {
                    objectReader = objectReader2;
                    matchStrength = hasFormat;
                    break;
                }
                objectReader = objectReader2;
                matchStrength = hasFormat;
            }
            i2++;
        }
        return accessorForReader.createMatcher(objectReader, matchStrength);
    }

    public Match findFormat(InputStream inputStream) throws IOException {
        return _findFormat(new AccessorForReader(inputStream, new byte[this._maxInputLookahead]));
    }

    public String toString() {
        StringBuilder m2872a = C0321a.m2872a('[');
        ObjectReader[] objectReaderArr = this._readers;
        int length = objectReaderArr.length;
        if (length > 0) {
            m2872a.append(objectReaderArr[0].getFactory().getFormatName());
            for (int i2 = 1; i2 < length; i2++) {
                m2872a.append(", ");
                m2872a.append(this._readers[i2].getFactory().getFormatName());
            }
        }
        m2872a.append(']');
        return m2872a.toString();
    }

    public DataFormatReaders with(ObjectReader[] objectReaderArr) {
        return new DataFormatReaders(objectReaderArr, this._optimalMatch, this._minimalMatch, this._maxInputLookahead);
    }

    public DataFormatReaders withMaxInputLookahead(int i2) {
        return i2 == this._maxInputLookahead ? this : new DataFormatReaders(this._readers, this._optimalMatch, this._minimalMatch, i2);
    }

    public DataFormatReaders withMinimalMatch(MatchStrength matchStrength) {
        return matchStrength == this._minimalMatch ? this : new DataFormatReaders(this._readers, this._optimalMatch, matchStrength, this._maxInputLookahead);
    }

    public DataFormatReaders withOptimalMatch(MatchStrength matchStrength) {
        return matchStrength == this._optimalMatch ? this : new DataFormatReaders(this._readers, matchStrength, this._minimalMatch, this._maxInputLookahead);
    }

    public DataFormatReaders withType(JavaType javaType) {
        int length = this._readers.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i2 = 0; i2 < length; i2++) {
            objectReaderArr[i2] = this._readers[i2].forType(javaType);
        }
        return new DataFormatReaders(objectReaderArr, this._optimalMatch, this._minimalMatch, this._maxInputLookahead);
    }

    public class AccessorForReader extends InputAccessor.Std {
        public AccessorForReader(InputStream inputStream, byte[] bArr) {
            super(inputStream, bArr);
        }

        public Match createMatcher(ObjectReader objectReader, MatchStrength matchStrength) {
            InputStream inputStream = this._in;
            byte[] bArr = this._buffer;
            int i2 = this._bufferedStart;
            return new Match(inputStream, bArr, i2, this._bufferedEnd - i2, objectReader, matchStrength);
        }

        public AccessorForReader(byte[] bArr) {
            super(bArr);
        }

        public AccessorForReader(byte[] bArr, int i2, int i3) {
            super(bArr, i2, i3);
        }
    }

    public DataFormatReaders(Collection<ObjectReader> collection) {
        this((ObjectReader[]) collection.toArray(new ObjectReader[collection.size()]));
    }

    public Match findFormat(byte[] bArr) throws IOException {
        return _findFormat(new AccessorForReader(bArr));
    }

    public DataFormatReaders with(DeserializationConfig deserializationConfig) {
        int length = this._readers.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i2 = 0; i2 < length; i2++) {
            objectReaderArr[i2] = this._readers[i2].with(deserializationConfig);
        }
        return new DataFormatReaders(objectReaderArr, this._optimalMatch, this._minimalMatch, this._maxInputLookahead);
    }

    private DataFormatReaders(ObjectReader[] objectReaderArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i2) {
        this._readers = objectReaderArr;
        this._optimalMatch = matchStrength;
        this._minimalMatch = matchStrength2;
        this._maxInputLookahead = i2;
    }

    public Match findFormat(byte[] bArr, int i2, int i3) throws IOException {
        return _findFormat(new AccessorForReader(bArr, i2, i3));
    }
}
