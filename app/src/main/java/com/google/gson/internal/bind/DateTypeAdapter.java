package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b */
    public static final TypeAdapterFactory f23771b = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        /* renamed from: a */
        public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.f23885a == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final List<DateFormat> f23772a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f23772a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (JavaVersion.f23703a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public Date mo12837b(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo12898C() == JsonToken.NULL) {
            jsonReader.mo12915v();
            return null;
        }
        String mo12897A = jsonReader.mo12897A();
        synchronized (this) {
            Iterator<DateFormat> it = this.f23772a.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(mo12897A);
                } catch (ParseException unused) {
                }
            }
            try {
                return ISO8601Utils.m12940b(mo12897A, new ParsePosition(0));
            } catch (ParseException e2) {
                throw new JsonSyntaxException(mo12897A, e2);
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void mo12838c(JsonWriter jsonWriter, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                jsonWriter.mo12923k();
            } else {
                jsonWriter.mo12927v(this.f23772a.get(0).format(date2));
            }
        }
    }
}
