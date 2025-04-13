package com.swiftsoft.anixartd.utils.database;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Converter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/database/Converter;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Converter {
    @JvmStatic
    @TypeConverter
    @NotNull
    /* renamed from: a */
    public static final String m16456a(@Nullable List<String> list) {
        if (list == null) {
            return "";
        }
        Gson gson = new Gson();
        Class<?> cls = list.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            gson.m12836g(list, cls, gson.m12835f(Streams.m12892b(stringWriter)));
            String stringWriter2 = stringWriter.toString();
            Intrinsics.m32178g(stringWriter2, "gson.toJson(list)");
            return stringWriter2;
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    @JvmStatic
    @TypeConverter
    @NotNull
    /* renamed from: b */
    public static final List<String> m16457b(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return EmptyList.f63144b;
        }
        Type type = new TypeToken<List<? extends String>>() { // from class: com.swiftsoft.anixartd.utils.database.Converter$fromString$listType$1
        }.f23886b;
        Intrinsics.m32178g(type, "object : TypeToken<List<String?>?>() {}.type");
        Object m12832c = new Gson().m12832c(str, type);
        Intrinsics.m32178g(m12832c, "Gson().fromJson(value, listType)");
        return (List) m12832c;
    }
}
