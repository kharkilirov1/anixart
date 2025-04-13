package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class NumberTypeAdapter extends TypeAdapter<Number> {

    /* renamed from: b */
    public static final TypeAdapterFactory f23790b = new NumberTypeAdapter(ToNumberPolicy.LAZILY_PARSED_NUMBER).new C22821();

    /* renamed from: a */
    public final ToNumberStrategy f23791a;

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$1 */
    class C22821 implements TypeAdapterFactory {
        public C22821() {
        }

        @Override // com.google.gson.TypeAdapterFactory
        /* renamed from: a */
        public <T> TypeAdapter<T> mo12853a(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.f23885a == Number.class) {
                return NumberTypeAdapter.this;
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$2 */
    public static /* synthetic */ class C22832 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23793a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f23793a = iArr;
            try {
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23793a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23793a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NumberTypeAdapter(ToNumberStrategy toNumberStrategy) {
        this.f23791a = toNumberStrategy;
    }

    /* renamed from: d */
    public static TypeAdapterFactory m12929d(ToNumberStrategy toNumberStrategy) {
        return toNumberStrategy == ToNumberPolicy.LAZILY_PARSED_NUMBER ? f23790b : new NumberTypeAdapter(toNumberStrategy).new C22821();
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public Number mo12837b(JsonReader jsonReader) throws IOException {
        JsonToken mo12898C = jsonReader.mo12898C();
        int ordinal = mo12898C.ordinal();
        if (ordinal == 5 || ordinal == 6) {
            return this.f23791a.mo12851a(jsonReader);
        }
        if (ordinal == 8) {
            jsonReader.mo12915v();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + mo12898C);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public void mo12838c(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.mo12926u(number);
    }
}
