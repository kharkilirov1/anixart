package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c */
    public static final TypeAdapterFactory f23765c = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        /* renamed from: a */
        public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
            Type type = typeToken.f23886b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(gson, gson.m12833d(new TypeToken<>(genericComponentType)), C$Gson$Types.m12860f(genericComponentType));
        }
    };

    /* renamed from: a */
    public final Class<E> f23766a;

    /* renamed from: b */
    public final TypeAdapter<E> f23767b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f23767b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f23766a = cls;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public Object mo12837b(JsonReader jsonReader) throws IOException {
        if (jsonReader.mo12898C() == JsonToken.NULL) {
            jsonReader.mo12915v();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.mo12900a();
        while (jsonReader.mo12905j()) {
            arrayList.add(this.f23767b.mo12837b(jsonReader));
        }
        jsonReader.mo12903g();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f23766a, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void mo12838c(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.mo12923k();
            return;
        }
        jsonWriter.mo12918b();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.f23767b.mo12838c(jsonWriter, Array.get(obj, i2));
        }
        jsonWriter.mo12920g();
    }
}
