package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;
import p000a.C0000a;

/* loaded from: classes2.dex */
public enum ToNumberPolicy implements ToNumberStrategy {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberStrategy
        /* renamed from: a */
        public Number mo12851a(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.mo12907n());
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberStrategy
        /* renamed from: a */
        public Number mo12851a(JsonReader jsonReader) throws IOException {
            return new LazilyParsedNumber(jsonReader.mo12897A());
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        @Override // com.google.gson.ToNumberStrategy
        /* renamed from: a */
        public Number mo12851a(JsonReader jsonReader) throws IOException, JsonParseException {
            String mo12897A = jsonReader.mo12897A();
            try {
                try {
                    return Long.valueOf(Long.parseLong(mo12897A));
                } catch (NumberFormatException e2) {
                    StringBuilder m28y = C0000a.m28y("Cannot parse ", mo12897A, "; at path ");
                    m28y.append(jsonReader.mo12914t());
                    throw new JsonParseException(m28y.toString(), e2);
                }
            } catch (NumberFormatException unused) {
                Double valueOf = Double.valueOf(mo12897A);
                if ((!valueOf.isInfinite() && !valueOf.isNaN()) || jsonReader.f23889c) {
                    return valueOf;
                }
                throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.mo12914t());
            }
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberStrategy
        /* renamed from: a */
        public Number mo12851a(JsonReader jsonReader) throws IOException {
            String mo12897A = jsonReader.mo12897A();
            try {
                return new BigDecimal(mo12897A);
            } catch (NumberFormatException e2) {
                StringBuilder m28y = C0000a.m28y("Cannot parse ", mo12897A, "; at path ");
                m28y.append(jsonReader.mo12914t());
                throw new JsonParseException(m28y.toString(), e2);
            }
        }
    };

    ToNumberPolicy(C22461 c22461) {
    }
}
