package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {

    /* renamed from: a */
    public final JsonSerializer<T> f23815a;

    /* renamed from: b */
    public final JsonDeserializer<T> f23816b;

    /* renamed from: c */
    public final Gson f23817c;

    /* renamed from: d */
    public final TypeToken<T> f23818d;

    /* renamed from: g */
    public TypeAdapter<T> f23821g;

    /* renamed from: f */
    public final TreeTypeAdapter<T>.GsonContextImpl f23820f = new GsonContextImpl(this, null);

    /* renamed from: e */
    public final TypeAdapterFactory f23819e = null;

    public final class GsonContextImpl implements JsonSerializationContext, JsonDeserializationContext {
        public GsonContextImpl(TreeTypeAdapter treeTypeAdapter, C22871 c22871) {
        }
    }

    public static final class SingleTypeFactory implements TypeAdapterFactory {
        @Override // com.google.gson.TypeAdapterFactory
        /* renamed from: a */
        public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> cls = typeToken.f23885a;
            throw null;
        }
    }

    public TreeTypeAdapter(JsonSerializer<T> jsonSerializer, JsonDeserializer<T> jsonDeserializer, Gson gson, TypeToken<T> typeToken, TypeAdapterFactory typeAdapterFactory) {
        this.f23815a = jsonSerializer;
        this.f23816b = jsonDeserializer;
        this.f23817c = gson;
        this.f23818d = typeToken;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public T mo12837b(JsonReader jsonReader) throws IOException {
        if (this.f23816b == null) {
            TypeAdapter<T> typeAdapter = this.f23821g;
            if (typeAdapter == null) {
                typeAdapter = this.f23817c.m12834e(this.f23819e, this.f23818d);
                this.f23821g = typeAdapter;
            }
            return typeAdapter.mo12837b(jsonReader);
        }
        JsonElement m12891a = Streams.m12891a(jsonReader);
        Objects.requireNonNull(m12891a);
        if (m12891a instanceof JsonNull) {
            return null;
        }
        return this.f23816b.m12842a(m12891a, this.f23818d.f23886b, this.f23820f);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void mo12838c(JsonWriter jsonWriter, T t) throws IOException {
        JsonSerializer<T> jsonSerializer = this.f23815a;
        if (jsonSerializer == null) {
            TypeAdapter<T> typeAdapter = this.f23821g;
            if (typeAdapter == null) {
                typeAdapter = this.f23817c.m12834e(this.f23819e, this.f23818d);
                this.f23821g = typeAdapter;
            }
            typeAdapter.mo12838c(jsonWriter, t);
            return;
        }
        if (t == null) {
            jsonWriter.mo12923k();
            return;
        }
        JsonElement m12850a = jsonSerializer.m12850a(t, this.f23818d.f23886b, this.f23820f);
        TypeAdapters.C230727 c230727 = (TypeAdapters.C230727) TypeAdapters.f23825A;
        Objects.requireNonNull(c230727);
        c230727.mo12838c(jsonWriter, m12850a);
    }
}
