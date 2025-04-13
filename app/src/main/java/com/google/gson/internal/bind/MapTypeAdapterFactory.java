package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: b */
    public final ConstructorConstructor f23784b;

    /* renamed from: c */
    public final boolean f23785c;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a */
        public final TypeAdapter<K> f23786a;

        /* renamed from: b */
        public final TypeAdapter<V> f23787b;

        /* renamed from: c */
        public final ObjectConstructor<? extends Map<K, V>> f23788c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.f23786a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f23787b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f23788c = objectConstructor;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public Object mo12837b(JsonReader jsonReader) throws IOException {
            JsonToken mo12898C = jsonReader.mo12898C();
            if (mo12898C == JsonToken.NULL) {
                jsonReader.mo12915v();
                return null;
            }
            Map<K, V> mo12866a = this.f23788c.mo12866a();
            if (mo12898C == JsonToken.BEGIN_ARRAY) {
                jsonReader.mo12900a();
                while (jsonReader.mo12905j()) {
                    jsonReader.mo12900a();
                    K mo12837b = this.f23786a.mo12837b(jsonReader);
                    if (mo12866a.put(mo12837b, this.f23787b.mo12837b(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + mo12837b);
                    }
                    jsonReader.mo12903g();
                }
                jsonReader.mo12903g();
            } else {
                jsonReader.mo12901b();
                while (jsonReader.mo12905j()) {
                    JsonReaderInternalAccess.f23704a.mo12869a(jsonReader);
                    K mo12837b2 = this.f23786a.mo12837b(jsonReader);
                    if (mo12866a.put(mo12837b2, this.f23787b.mo12837b(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + mo12837b2);
                    }
                }
                jsonReader.mo12904h();
            }
            return mo12866a;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void mo12838c(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.mo12923k();
                return;
            }
            if (!MapTypeAdapterFactory.this.f23785c) {
                jsonWriter.mo12919c();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.mo12922i(String.valueOf(entry.getKey()));
                    this.f23787b.mo12838c(jsonWriter, entry.getValue());
                }
                jsonWriter.mo12921h();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                TypeAdapter<K> typeAdapter = this.f23786a;
                K key = entry2.getKey();
                Objects.requireNonNull(typeAdapter);
                try {
                    JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
                    typeAdapter.mo12838c(jsonTreeWriter, key);
                    if (!jsonTreeWriter.f23781m.isEmpty()) {
                        throw new IllegalStateException("Expected one JSON element but was " + jsonTreeWriter.f23781m);
                    }
                    JsonElement jsonElement = jsonTreeWriter.f23783o;
                    arrayList.add(jsonElement);
                    arrayList2.add(entry2.getValue());
                    Objects.requireNonNull(jsonElement);
                    z |= (jsonElement instanceof JsonArray) || (jsonElement instanceof JsonObject);
                } catch (IOException e2) {
                    throw new JsonIOException(e2);
                }
            }
            if (z) {
                jsonWriter.mo12918b();
                int size = arrayList.size();
                while (i2 < size) {
                    jsonWriter.mo12918b();
                    TypeAdapters.f23825A.mo12838c(jsonWriter, (JsonElement) arrayList.get(i2));
                    this.f23787b.mo12838c(jsonWriter, arrayList2.get(i2));
                    jsonWriter.mo12920g();
                    i2++;
                }
                jsonWriter.mo12920g();
                return;
            }
            jsonWriter.mo12919c();
            int size2 = arrayList.size();
            while (i2 < size2) {
                JsonElement jsonElement2 = (JsonElement) arrayList.get(i2);
                Objects.requireNonNull(jsonElement2);
                if (jsonElement2 instanceof JsonPrimitive) {
                    JsonPrimitive m12845e = jsonElement2.m12845e();
                    Object obj2 = m12845e.f23669a;
                    if (obj2 instanceof Number) {
                        str = String.valueOf(m12845e.m12849s());
                    } else if (obj2 instanceof Boolean) {
                        str = Boolean.toString(m12845e.m12848r());
                    } else {
                        if (!(obj2 instanceof String)) {
                            throw new AssertionError();
                        }
                        str = m12845e.mo12841g();
                    }
                } else {
                    if (!(jsonElement2 instanceof JsonNull)) {
                        throw new AssertionError();
                    }
                    str = "null";
                }
                jsonWriter.mo12922i(str);
                this.f23787b.mo12838c(jsonWriter, arrayList2.get(i2));
                i2++;
            }
            jsonWriter.mo12921h();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z) {
        this.f23784b = constructorConstructor;
        this.f23785c = z;
    }

    @Override // com.google.gson.TypeAdapterFactory
    /* renamed from: a */
    public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
        Type[] actualTypeArguments;
        Type type = typeToken.f23886b;
        if (!Map.class.isAssignableFrom(typeToken.f23885a)) {
            return null;
        }
        Class<?> m12860f = C$Gson$Types.m12860f(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type m12861g = C$Gson$Types.m12861g(type, m12860f, Map.class);
            actualTypeArguments = m12861g instanceof ParameterizedType ? ((ParameterizedType) m12861g).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new Adapter(gson, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f23830c : gson.m12833d(new TypeToken<>(type2)), actualTypeArguments[1], gson.m12833d(new TypeToken<>(actualTypeArguments[1])), this.f23784b.m12865a(typeToken));
    }
}
