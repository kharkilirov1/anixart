package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class TypeAdapter<T> {

    /* renamed from: com.google.gson.TypeAdapter$1 */
    public class C22501 extends TypeAdapter<T> {
        public C22501() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public T mo12837b(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo12898C() != JsonToken.NULL) {
                return (T) TypeAdapter.this.mo12837b(jsonReader);
            }
            jsonReader.mo12915v();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void mo12838c(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.mo12923k();
            } else {
                TypeAdapter.this.mo12838c(jsonWriter, t);
            }
        }
    }

    /* renamed from: a */
    public final TypeAdapter<T> m12852a() {
        return new C22501();
    }

    /* renamed from: b */
    public abstract T mo12837b(JsonReader jsonReader) throws IOException;

    /* renamed from: c */
    public abstract void mo12838c(JsonWriter jsonWriter, T t) throws IOException;
}
