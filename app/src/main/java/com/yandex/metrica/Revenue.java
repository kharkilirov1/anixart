package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C4246qo;
import com.yandex.metrica.impl.p023ob.C4272ro;
import com.yandex.metrica.impl.p023ob.InterfaceC4350uo;
import java.util.Currency;

/* loaded from: classes2.dex */
public class Revenue {

    @NonNull
    public final Currency currency;

    @Nullable
    public final String payload;

    @Nullable
    @Deprecated
    public final Double price;

    @Nullable
    public final Long priceMicros;

    @Nullable
    public final String productID;

    @Nullable
    public final Integer quantity;

    @Nullable
    public final Receipt receipt;

    public static class Receipt {

        @Nullable
        public final String data;

        @Nullable
        public final String signature;

        public static class Builder {

            /* renamed from: a */
            @Nullable
            public String f42271a;

            /* renamed from: b */
            @Nullable
            public String f42272b;

            @NonNull
            public Receipt build() {
                return new Receipt(this, null);
            }

            @NonNull
            public Builder withData(@Nullable String str) {
                this.f42271a = str;
                return this;
            }

            @NonNull
            public Builder withSignature(@Nullable String str) {
                this.f42272b = str;
                return this;
            }
        }

        public Receipt(Builder builder, C3088a c3088a) {
            this.data = builder.f42271a;
            this.signature = builder.f42272b;
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder();
        }
    }

    public Revenue(Builder builder, C3088a c3088a) {
        this.price = builder.f42264a;
        this.priceMicros = builder.f42265b;
        this.currency = builder.f42266c;
        this.quantity = builder.f42267d;
        this.productID = builder.f42268e;
        this.payload = builder.f42269f;
        this.receipt = builder.f42270g;
    }

    @NonNull
    @Deprecated
    public static Builder newBuilder(double d, @NonNull Currency currency) {
        return new Builder(d, currency);
    }

    @NonNull
    public static Builder newBuilderWithMicros(long j2, @NonNull Currency currency) {
        return new Builder(j2, currency);
    }

    public static class Builder {

        /* renamed from: h */
        public static final InterfaceC4350uo<Currency> f42263h = new C4272ro(new C4246qo("revenue currency"));

        /* renamed from: a */
        @Nullable
        public Double f42264a;

        /* renamed from: b */
        @Nullable
        public Long f42265b;

        /* renamed from: c */
        @NonNull
        public Currency f42266c;

        /* renamed from: d */
        @Nullable
        public Integer f42267d;

        /* renamed from: e */
        @Nullable
        public String f42268e;

        /* renamed from: f */
        @Nullable
        public String f42269f;

        /* renamed from: g */
        @Nullable
        public Receipt f42270g;

        public Builder(double d, @NonNull Currency currency) {
            ((C4272ro) f42263h).mo18360a(currency);
            this.f42264a = Double.valueOf(d);
            this.f42266c = currency;
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, null);
        }

        @NonNull
        public Builder withPayload(@Nullable String str) {
            this.f42269f = str;
            return this;
        }

        @NonNull
        public Builder withProductID(@Nullable String str) {
            this.f42268e = str;
            return this;
        }

        @NonNull
        public Builder withQuantity(@Nullable Integer num) {
            this.f42267d = num;
            return this;
        }

        @NonNull
        public Builder withReceipt(@Nullable Receipt receipt) {
            this.f42270g = receipt;
            return this;
        }

        public Builder(long j2, @NonNull Currency currency) {
            ((C4272ro) f42263h).mo18360a(currency);
            this.f42265b = Long.valueOf(j2);
            this.f42266c = currency;
        }
    }
}
