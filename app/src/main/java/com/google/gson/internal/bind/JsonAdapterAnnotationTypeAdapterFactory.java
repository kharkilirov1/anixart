package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: b */
    public final ConstructorConstructor f23773b;

    public JsonAdapterAnnotationTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.f23773b = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    /* renamed from: a */
    public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.f23885a.getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return (TypeAdapter<T>) m12895b(this.f23773b, gson, typeToken, jsonAdapter);
    }

    /* renamed from: b */
    public TypeAdapter<?> m12895b(ConstructorConstructor constructorConstructor, Gson gson, TypeToken<?> typeToken, JsonAdapter jsonAdapter) {
        TypeAdapter<?> treeTypeAdapter;
        Object mo12866a = constructorConstructor.m12865a(new TypeToken(jsonAdapter.value())).mo12866a();
        if (mo12866a instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) mo12866a;
        } else if (mo12866a instanceof TypeAdapterFactory) {
            treeTypeAdapter = ((TypeAdapterFactory) mo12866a).mo12853a(gson, typeToken);
        } else {
            boolean z = mo12866a instanceof JsonSerializer;
            if (!z && !(mo12866a instanceof JsonDeserializer)) {
                StringBuilder m24u = C0000a.m24u("Invalid attempt to bind an instance of ");
                m24u.append(mo12866a.getClass().getName());
                m24u.append(" as a @JsonAdapter for ");
                m24u.append(typeToken.toString());
                m24u.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(m24u.toString());
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z ? (JsonSerializer) mo12866a : null, mo12866a instanceof JsonDeserializer ? (JsonDeserializer) mo12866a : null, gson, typeToken, null);
        }
        return (treeTypeAdapter == null || !jsonAdapter.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.m12852a();
    }
}
