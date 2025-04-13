package com.google.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class Gson {

    /* renamed from: n */
    public static final TypeToken<?> f23649n = new TypeToken<>(Object.class);

    /* renamed from: a */
    public final ThreadLocal<Map<TypeToken<?>, FutureTypeAdapter<?>>> f23650a;

    /* renamed from: b */
    public final Map<TypeToken<?>, TypeAdapter<?>> f23651b;

    /* renamed from: c */
    public final ConstructorConstructor f23652c;

    /* renamed from: d */
    public final JsonAdapterAnnotationTypeAdapterFactory f23653d;

    /* renamed from: e */
    public final List<TypeAdapterFactory> f23654e;

    /* renamed from: f */
    public final Map<Type, InstanceCreator<?>> f23655f;

    /* renamed from: g */
    public final boolean f23656g;

    /* renamed from: h */
    public final boolean f23657h;

    /* renamed from: i */
    public final boolean f23658i;

    /* renamed from: j */
    public final boolean f23659j;

    /* renamed from: k */
    public final boolean f23660k;

    /* renamed from: l */
    public final List<TypeAdapterFactory> f23661l;

    /* renamed from: m */
    public final List<TypeAdapterFactory> f23662m;

    /* renamed from: com.google.gson.Gson$3 */
    class C22413 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public Number mo12837b(JsonReader jsonReader) throws IOException {
            if (jsonReader.mo12898C() != JsonToken.NULL) {
                return Long.valueOf(jsonReader.mo12911p());
            }
            jsonReader.mo12915v();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void mo12838c(JsonWriter jsonWriter, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                jsonWriter.mo12923k();
            } else {
                jsonWriter.mo12927v(number2.toString());
            }
        }
    }

    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {

        /* renamed from: a */
        public TypeAdapter<T> f23665a;

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public T mo12837b(JsonReader jsonReader) throws IOException {
            TypeAdapter<T> typeAdapter = this.f23665a;
            if (typeAdapter != null) {
                return typeAdapter.mo12837b(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void mo12838c(JsonWriter jsonWriter, T t) throws IOException {
            TypeAdapter<T> typeAdapter = this.f23665a;
            if (typeAdapter == null) {
                throw new IllegalStateException();
            }
            typeAdapter.mo12838c(jsonWriter, t);
        }
    }

    public Gson() {
        Excluder excluder = Excluder.f23694d;
        FieldNamingPolicy fieldNamingPolicy = FieldNamingPolicy.IDENTITY;
        Map<Type, InstanceCreator<?>> emptyMap = Collections.emptyMap();
        List<TypeAdapterFactory> emptyList = Collections.emptyList();
        List<TypeAdapterFactory> emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        ToNumberPolicy toNumberPolicy = ToNumberPolicy.DOUBLE;
        ToNumberPolicy toNumberPolicy2 = ToNumberPolicy.LAZILY_PARSED_NUMBER;
        this.f23650a = new ThreadLocal<>();
        this.f23651b = new ConcurrentHashMap();
        this.f23655f = emptyMap;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(emptyMap);
        this.f23652c = constructorConstructor;
        this.f23656g = false;
        this.f23657h = false;
        this.f23658i = true;
        this.f23659j = false;
        this.f23660k = false;
        this.f23661l = emptyList;
        this.f23662m = emptyList2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f23826B);
        arrayList.add(ObjectTypeAdapter.m12930d(toNumberPolicy));
        arrayList.add(excluder);
        arrayList.addAll(emptyList3);
        arrayList.add(TypeAdapters.f23844q);
        arrayList.add(TypeAdapters.f23834g);
        arrayList.add(TypeAdapters.f23831d);
        arrayList.add(TypeAdapters.f23832e);
        arrayList.add(TypeAdapters.f23833f);
        final TypeAdapter<Number> typeAdapter = TypeAdapters.f23838k;
        arrayList.add(TypeAdapters.m12936b(Long.TYPE, Long.class, typeAdapter));
        arrayList.add(TypeAdapters.m12936b(Double.TYPE, Double.class, new TypeAdapter<Number>(this) { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Number mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.mo12907n());
                }
                jsonReader.mo12915v();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    jsonWriter.mo12923k();
                } else {
                    Gson.m12830a(number2.doubleValue());
                    jsonWriter.mo12926u(number2);
                }
            }
        }));
        arrayList.add(TypeAdapters.m12936b(Float.TYPE, Float.class, new TypeAdapter<Number>(this) { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public Number mo12837b(JsonReader jsonReader) throws IOException {
                if (jsonReader.mo12898C() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.mo12907n());
                }
                jsonReader.mo12915v();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: c */
            public void mo12838c(JsonWriter jsonWriter, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    jsonWriter.mo12923k();
                } else {
                    Gson.m12830a(number2.floatValue());
                    jsonWriter.mo12926u(number2);
                }
            }
        }));
        arrayList.add(NumberTypeAdapter.m12929d(toNumberPolicy2));
        arrayList.add(TypeAdapters.f23835h);
        arrayList.add(TypeAdapters.f23836i);
        arrayList.add(TypeAdapters.m12935a(AtomicLong.class, new TypeAdapter.C22501()));
        arrayList.add(TypeAdapters.m12935a(AtomicLongArray.class, new TypeAdapter.C22501()));
        arrayList.add(TypeAdapters.f23837j);
        arrayList.add(TypeAdapters.f23841n);
        arrayList.add(TypeAdapters.f23845r);
        arrayList.add(TypeAdapters.f23846s);
        arrayList.add(TypeAdapters.m12935a(BigDecimal.class, TypeAdapters.f23842o));
        arrayList.add(TypeAdapters.m12935a(BigInteger.class, TypeAdapters.f23843p));
        arrayList.add(TypeAdapters.f23847t);
        arrayList.add(TypeAdapters.f23848u);
        arrayList.add(TypeAdapters.f23850w);
        arrayList.add(TypeAdapters.f23851x);
        arrayList.add(TypeAdapters.f23853z);
        arrayList.add(TypeAdapters.f23849v);
        arrayList.add(TypeAdapters.f23829b);
        arrayList.add(DateTypeAdapter.f23771b);
        arrayList.add(TypeAdapters.f23852y);
        if (SqlTypesSupport.f23881a) {
            arrayList.add(SqlTypesSupport.f23883c);
            arrayList.add(SqlTypesSupport.f23882b);
            arrayList.add(SqlTypesSupport.f23884d);
        }
        arrayList.add(ArrayTypeAdapter.f23765c);
        arrayList.add(TypeAdapters.f23828a);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor, false));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.f23653d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f23827C);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, fieldNamingPolicy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f23654e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m12830a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: b */
    public <T> T m12831b(String str, Class<T> cls) throws JsonSyntaxException {
        Object m12832c = m12832c(str, cls);
        if (cls == Integer.TYPE) {
            cls = (Class<T>) Integer.class;
        } else if (cls == Float.TYPE) {
            cls = (Class<T>) Float.class;
        } else if (cls == Byte.TYPE) {
            cls = (Class<T>) Byte.class;
        } else if (cls == Double.TYPE) {
            cls = (Class<T>) Double.class;
        } else if (cls == Long.TYPE) {
            cls = (Class<T>) Long.class;
        } else if (cls == Character.TYPE) {
            cls = (Class<T>) Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = (Class<T>) Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = (Class<T>) Short.class;
        } else if (cls == Void.TYPE) {
            cls = (Class<T>) Void.class;
        }
        return cls.cast(m12832c);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: c */
    public <T> T m12832c(String str, Type type) throws JsonSyntaxException {
        T t = null;
        if (str == null) {
            return null;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        boolean z = this.f23660k;
        jsonReader.f23889c = z;
        boolean z2 = true;
        jsonReader.f23889c = true;
        try {
            try {
                try {
                    jsonReader.mo12898C();
                    z2 = false;
                    t = m12833d(new TypeToken<>(type)).mo12837b(jsonReader);
                } catch (IOException e2) {
                    throw new JsonSyntaxException(e2);
                } catch (IllegalStateException e3) {
                    throw new JsonSyntaxException(e3);
                }
            } catch (EOFException e4) {
                if (!z2) {
                    throw new JsonSyntaxException(e4);
                }
            } catch (AssertionError e5) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e5.getMessage());
                assertionError.initCause(e5);
                throw assertionError;
            }
            jsonReader.f23889c = z;
            if (t != null) {
                try {
                    if (jsonReader.mo12898C() != JsonToken.END_DOCUMENT) {
                        throw new JsonIOException("JSON document was not fully consumed.");
                    }
                } catch (MalformedJsonException e6) {
                    throw new JsonSyntaxException(e6);
                } catch (IOException e7) {
                    throw new JsonIOException(e7);
                }
            }
            return t;
        } catch (Throwable th) {
            jsonReader.f23889c = z;
            throw th;
        }
    }

    /* renamed from: d */
    public <T> TypeAdapter<T> m12833d(TypeToken<T> typeToken) {
        TypeAdapter<T> typeAdapter = (TypeAdapter) this.f23651b.get(typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<TypeToken<?>, FutureTypeAdapter<?>> map = this.f23650a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f23650a.set(map);
            z = true;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(typeToken);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(typeToken, futureTypeAdapter2);
            Iterator<TypeAdapterFactory> it = this.f23654e.iterator();
            while (it.hasNext()) {
                TypeAdapter<T> mo12853a = it.next().mo12853a(this, typeToken);
                if (mo12853a != null) {
                    if (futureTypeAdapter2.f23665a != null) {
                        throw new AssertionError();
                    }
                    futureTypeAdapter2.f23665a = mo12853a;
                    this.f23651b.put(typeToken, mo12853a);
                    return mo12853a;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + typeToken);
        } finally {
            map.remove(typeToken);
            if (z) {
                this.f23650a.remove();
            }
        }
    }

    /* renamed from: e */
    public <T> TypeAdapter<T> m12834e(TypeAdapterFactory typeAdapterFactory, TypeToken<T> typeToken) {
        if (!this.f23654e.contains(typeAdapterFactory)) {
            typeAdapterFactory = this.f23653d;
        }
        boolean z = false;
        for (TypeAdapterFactory typeAdapterFactory2 : this.f23654e) {
            if (z) {
                TypeAdapter<T> mo12853a = typeAdapterFactory2.mo12853a(this, typeToken);
                if (mo12853a != null) {
                    return mo12853a;
                }
            } else if (typeAdapterFactory2 == typeAdapterFactory) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    /* renamed from: f */
    public JsonWriter m12835f(Writer writer) throws IOException {
        if (this.f23657h) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f23659j) {
            jsonWriter.f23919e = "  ";
            jsonWriter.f23920f = ": ";
        }
        jsonWriter.f23924j = this.f23656g;
        return jsonWriter;
    }

    /* renamed from: g */
    public void m12836g(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        TypeAdapter m12833d = m12833d(new TypeToken(type));
        boolean z = jsonWriter.f23921g;
        jsonWriter.f23921g = true;
        boolean z2 = jsonWriter.f23922h;
        jsonWriter.f23922h = this.f23658i;
        boolean z3 = jsonWriter.f23924j;
        jsonWriter.f23924j = this.f23656g;
        try {
            try {
                m12833d.mo12838c(jsonWriter, obj);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            jsonWriter.f23921g = z;
            jsonWriter.f23922h = z2;
            jsonWriter.f23924j = z3;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f23656g + ",factories:" + this.f23654e + ",instanceCreators:" + this.f23652c + "}";
    }
}
