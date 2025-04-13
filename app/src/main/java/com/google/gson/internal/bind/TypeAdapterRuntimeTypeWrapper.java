package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a */
    public final Gson f23822a;

    /* renamed from: b */
    public final TypeAdapter<T> f23823b;

    /* renamed from: c */
    public final Type f23824c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f23822a = gson;
        this.f23823b = typeAdapter;
        this.f23824c = type;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public T mo12837b(JsonReader jsonReader) throws IOException {
        return this.f23823b.mo12837b(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void mo12838c(JsonWriter jsonWriter, T t) throws IOException {
        TypeAdapter<T> typeAdapter = this.f23823b;
        Type type = this.f23824c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.f23824c) {
            typeAdapter = this.f23822a.m12833d(new TypeToken<>(type));
            if (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter2 = this.f23823b;
                if (!(typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapter = typeAdapter2;
                }
            }
        }
        typeAdapter.mo12838c(jsonWriter, t);
    }
}
