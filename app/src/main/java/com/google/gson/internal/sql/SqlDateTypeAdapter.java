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
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b */
    public static final TypeAdapterFactory f23875b = new TypeAdapterFactory() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        /* renamed from: a */
        public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.f23885a == Date.class) {
                return new SqlDateTypeAdapter(null);
            }
            return null;
        }
    };

    /* renamed from: a */
    public final DateFormat f23876a = new SimpleDateFormat("MMM d, yyyy");

    public SqlDateTypeAdapter() {
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public Date mo12837b(JsonReader jsonReader) throws IOException {
        Date date;
        synchronized (this) {
            if (jsonReader.mo12898C() == JsonToken.NULL) {
                jsonReader.mo12915v();
                date = null;
            } else {
                try {
                    date = new Date(this.f23876a.parse(jsonReader.mo12897A()).getTime());
                } catch (ParseException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }
        }
        return date;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void mo12838c(JsonWriter jsonWriter, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            jsonWriter.mo12927v(date2 == null ? null : this.f23876a.format((java.util.Date) date2));
        }
    }

    public SqlDateTypeAdapter(C23231 c23231) {
    }
}
