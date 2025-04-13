package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: b */
    public final ConstructorConstructor f23768b;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a */
        public final TypeAdapter<E> f23769a;

        /* renamed from: b */
        public final ObjectConstructor<? extends Collection<E>> f23770b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.f23769a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f23770b = objectConstructor;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public Object mo12837b(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo12898C() == JsonToken.NULL) {
                jsonReader.mo12915v();
                return null;
            }
            Collection<E> mo12866a = this.f23770b.mo12866a();
            jsonReader.mo12900a();
            while (jsonReader.mo12905j()) {
                mo12866a.add(this.f23769a.mo12837b(jsonReader));
            }
            jsonReader.mo12903g();
            return mo12866a;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void mo12838c(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.mo12923k();
                return;
            }
            jsonWriter.mo12918b();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f23769a.mo12838c(jsonWriter, it.next());
            }
            jsonWriter.mo12920g();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.f23768b = constructorConstructor;
    }

    @Override // com.google.gson.TypeAdapterFactory
    /* renamed from: a */
    public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.f23886b;
        Class<? super T> cls = typeToken.f23885a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type m12861g = C$Gson$Types.m12861g(type, cls, Collection.class);
        if (m12861g instanceof WildcardType) {
            m12861g = ((WildcardType) m12861g).getUpperBounds()[0];
        }
        Class cls2 = m12861g instanceof ParameterizedType ? ((ParameterizedType) m12861g).getActualTypeArguments()[0] : Object.class;
        return new Adapter(gson, cls2, gson.m12833d(new TypeToken<>(cls2)), this.f23768b.m12865a(typeToken));
    }
}
