package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Date;

/* loaded from: classes2.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    public static abstract class DateType<T extends Date> {

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType$1 */
        public class C22791 extends DateType<Date> {
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public Object mo12837b(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo12898C() == JsonToken.NULL) {
            jsonReader.mo12915v();
            return null;
        }
        jsonReader.mo12897A();
        throw null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void mo12838c(JsonWriter jsonWriter, Object obj) throws IOException {
        if (((Date) obj) != null) {
            throw null;
        }
        jsonWriter.mo12923k();
    }

    public String toString() {
        throw null;
    }
}
