package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b */
    public static final TypeAdapterFactory f23879b = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        /* renamed from: a */
        public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.f23885a != Timestamp.class) {
                return null;
            }
            Objects.requireNonNull(gson);
            return new SqlTimestampTypeAdapter(gson.m12833d(new TypeToken<>(Date.class)), null);
        }
    };

    /* renamed from: a */
    public final TypeAdapter<Date> f23880a;

    public SqlTimestampTypeAdapter(TypeAdapter typeAdapter, C23251 c23251) {
        this.f23880a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public Timestamp mo12837b(JsonReader jsonReader) throws IOException {
        Date mo12837b = this.f23880a.mo12837b(jsonReader);
        if (mo12837b != null) {
            return new Timestamp(mo12837b.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void mo12838c(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.f23880a.mo12838c(jsonWriter, timestamp);
    }
}
