package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b */
    public static final TypeAdapterFactory f23877b = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        /* renamed from: a */
        public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.f23885a == Time.class) {
                return new SqlTimeTypeAdapter(null);
            }
            return null;
        }
    };

    /* renamed from: a */
    public final DateFormat f23878a = new SimpleDateFormat("hh:mm:ss a");

    public SqlTimeTypeAdapter() {
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public Time mo12837b(JsonReader jsonReader) throws IOException {
        synchronized (this) {
            if (jsonReader.mo12898C() == JsonToken.NULL) {
                jsonReader.mo12915v();
                return null;
            }
            try {
                return new Time(this.f23878a.parse(jsonReader.mo12897A()).getTime());
            } catch (ParseException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void mo12838c(JsonWriter jsonWriter, Time time) throws IOException {
        Time time2 = time;
        synchronized (this) {
            jsonWriter.mo12927v(time2 == null ? null : this.f23878a.format((Date) time2));
        }
    }

    public SqlTimeTypeAdapter(C23241 c23241) {
    }
}
