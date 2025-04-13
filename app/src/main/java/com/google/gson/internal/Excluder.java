package com.google.gson.internal;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Excluder implements TypeAdapterFactory, Cloneable {

    /* renamed from: d */
    public static final Excluder f23694d = new Excluder();

    /* renamed from: b */
    public List<ExclusionStrategy> f23695b = Collections.emptyList();

    /* renamed from: c */
    public List<ExclusionStrategy> f23696c = Collections.emptyList();

    @Override // com.google.gson.TypeAdapterFactory
    /* renamed from: a */
    public <T> TypeAdapter<T> mo12853a(final Gson gson, final TypeToken<T> typeToken) {
        Class<? super T> cls = typeToken.f23885a;
        boolean m12868c = m12868c(cls);
        final boolean z = m12868c || m12867b(cls, true);
        final boolean z2 = m12868c || m12867b(cls, false);
        if (z || z2) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a */
                public TypeAdapter<T> f23697a;

                @Override // com.google.gson.TypeAdapter
                /* renamed from: b */
                public T mo12837b(JsonReader jsonReader) throws IOException {
                    if (z2) {
                        jsonReader.mo12899Z();
                        return null;
                    }
                    TypeAdapter<T> typeAdapter = this.f23697a;
                    if (typeAdapter == null) {
                        typeAdapter = gson.m12834e(Excluder.this, typeToken);
                        this.f23697a = typeAdapter;
                    }
                    return typeAdapter.mo12837b(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                /* renamed from: c */
                public void mo12838c(JsonWriter jsonWriter, T t) throws IOException {
                    if (z) {
                        jsonWriter.mo12923k();
                        return;
                    }
                    TypeAdapter<T> typeAdapter = this.f23697a;
                    if (typeAdapter == null) {
                        typeAdapter = gson.m12834e(Excluder.this, typeToken);
                        this.f23697a = typeAdapter;
                    }
                    typeAdapter.mo12838c(jsonWriter, t);
                }
            };
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m12867b(Class<?> cls, boolean z) {
        Iterator<ExclusionStrategy> it = (z ? this.f23695b : this.f23696c).iterator();
        while (it.hasNext()) {
            if (it.next().m12826b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m12868c(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        if ((cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
