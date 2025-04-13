package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: c */
    public static final TypeAdapterFactory f23794c = new C22841(ToNumberPolicy.DOUBLE);

    /* renamed from: a */
    public final Gson f23795a;

    /* renamed from: b */
    public final ToNumberStrategy f23796b;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1 */
    class C22841 implements TypeAdapterFactory {

        /* renamed from: b */
        public final /* synthetic */ ToNumberStrategy f23797b;

        public C22841(ToNumberStrategy toNumberStrategy) {
            this.f23797b = toNumberStrategy;
        }

        @Override // com.google.gson.TypeAdapterFactory
        /* renamed from: a */
        public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.f23885a == Object.class) {
                return new ObjectTypeAdapter(gson, this.f23797b, null);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2 */
    public static /* synthetic */ class C22852 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23798a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f23798a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23798a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23798a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23798a[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23798a[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23798a[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ObjectTypeAdapter(Gson gson, ToNumberStrategy toNumberStrategy, C22841 c22841) {
        this.f23795a = gson;
        this.f23796b = toNumberStrategy;
    }

    /* renamed from: d */
    public static TypeAdapterFactory m12930d(ToNumberStrategy toNumberStrategy) {
        return toNumberStrategy == ToNumberPolicy.DOUBLE ? f23794c : new C22841(toNumberStrategy);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public Object mo12837b(JsonReader jsonReader) throws IOException {
        int ordinal = jsonReader.mo12898C().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            jsonReader.mo12900a();
            while (jsonReader.mo12905j()) {
                arrayList.add(mo12837b(jsonReader));
            }
            jsonReader.mo12903g();
            return arrayList;
        }
        if (ordinal == 2) {
            LinkedTreeMap linkedTreeMap = new LinkedTreeMap(LinkedTreeMap.f23735i);
            jsonReader.mo12901b();
            while (jsonReader.mo12905j()) {
                linkedTreeMap.put(jsonReader.mo12912q(), mo12837b(jsonReader));
            }
            jsonReader.mo12904h();
            return linkedTreeMap;
        }
        if (ordinal == 5) {
            return jsonReader.mo12897A();
        }
        if (ordinal == 6) {
            return this.f23796b.mo12851a(jsonReader);
        }
        if (ordinal == 7) {
            return Boolean.valueOf(jsonReader.mo12906m());
        }
        if (ordinal != 8) {
            throw new IllegalStateException();
        }
        jsonReader.mo12915v();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void mo12838c(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.mo12923k();
            return;
        }
        Gson gson = this.f23795a;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(gson);
        TypeAdapter m12833d = gson.m12833d(new TypeToken(cls));
        if (!(m12833d instanceof ObjectTypeAdapter)) {
            m12833d.mo12838c(jsonWriter, obj);
        } else {
            jsonWriter.mo12919c();
            jsonWriter.mo12921h();
        }
    }
}
