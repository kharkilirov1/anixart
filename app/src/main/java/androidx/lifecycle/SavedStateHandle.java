package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SavedStateHandle.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/lifecycle/SavedStateHandle;", "", "Companion", "SavingStateLiveData", "lifecycle-viewmodel-savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SavedStateHandle {

    /* renamed from: f */
    @NotNull
    public static final Companion f4655f = new Companion(null);

    /* renamed from: g */
    @NotNull
    public static final Class<? extends Object>[] f4656g = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    @NotNull
    public final Map<String, Object> f4657a;

    /* renamed from: b */
    @NotNull
    public final Map<String, SavedStateRegistry.SavedStateProvider> f4658b;

    /* renamed from: c */
    @NotNull
    public final Map<String, SavingStateLiveData<?>> f4659c;

    /* renamed from: d */
    @NotNull
    public final Map<String, MutableStateFlow<Object>> f4660d;

    /* renamed from: e */
    @NotNull
    public final SavedStateRegistry.SavedStateProvider f4661e;

    /* compiled from: SavedStateHandle.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R$\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m31884d2 = {"Landroidx/lifecycle/SavedStateHandle$Companion;", "", "", "Ljava/lang/Class;", "ACCEPTABLE_CLASSES", "[Ljava/lang/Class;", "", "KEYS", "Ljava/lang/String;", "VALUES", "lifecycle-viewmodel-savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @RestrictTo
        @NotNull
        /* renamed from: a */
        public final SavedStateHandle m3233a(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new SavedStateHandle();
                }
                HashMap hashMap = new HashMap();
                for (String key : bundle2.keySet()) {
                    Intrinsics.m32178g(key, "key");
                    hashMap.put(key, bundle2.get(key));
                }
                return new SavedStateHandle(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (!((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true)) {
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = parcelableArrayList.get(i2);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
            }
            return new SavedStateHandle(linkedHashMap);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: SavedStateHandle.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Landroidx/lifecycle/SavedStateHandle$SavingStateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "lifecycle-viewmodel-savedstate_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class SavingStateLiveData<T> extends MutableLiveData<T> {
        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        /* renamed from: l */
        public void mo3216l(T t) {
            super.mo3216l(t);
        }
    }

    public SavedStateHandle(@NotNull Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f4657a = linkedHashMap;
        this.f4658b = new LinkedHashMap();
        this.f4659c = new LinkedHashMap();
        this.f4660d = new LinkedHashMap();
        final int i2 = 1;
        this.f4661e = new SavedStateRegistry.SavedStateProvider(this) { // from class: androidx.lifecycle.a

            /* renamed from: b */
            public final /* synthetic */ SavedStateHandle f4703b;

            {
                this.f4703b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            /* renamed from: a */
            public final Bundle mo313a() {
                switch (i2) {
                }
                return SavedStateHandle.m3232a(this.f4703b);
            }
        };
        linkedHashMap.putAll(map);
    }

    /* renamed from: a */
    public static Bundle m3232a(SavedStateHandle this$0) {
        Intrinsics.m32179h(this$0, "this$0");
        Iterator it = MapsKt.m32068m(this$0.f4658b).entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                Set<String> keySet = this$0.f4657a.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(this$0.f4657a.get(str));
                }
                return BundleKt.m1944a(new Pair("keys", arrayList), new Pair("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Bundle mo313a = ((SavedStateRegistry.SavedStateProvider) entry.getValue()).mo313a();
            Intrinsics.m32179h(key, "key");
            if (mo313a != null) {
                Class<? extends Object>[] clsArr = f4656g;
                int length = clsArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    Class<? extends Object> cls = clsArr[i2];
                    Intrinsics.m32176e(cls);
                    if (cls.isInstance(mo313a)) {
                        break;
                    }
                    i2++;
                }
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't put value with type ");
                Intrinsics.m32176e(mo313a);
                sb.append(mo313a.getClass());
                sb.append(" into saved state");
                throw new IllegalArgumentException(sb.toString());
            }
            SavingStateLiveData<?> savingStateLiveData = this$0.f4659c.get(key);
            SavingStateLiveData<?> savingStateLiveData2 = savingStateLiveData instanceof MutableLiveData ? savingStateLiveData : null;
            if (savingStateLiveData2 != null) {
                savingStateLiveData2.mo3216l(mo313a);
            } else {
                this$0.f4657a.put(key, mo313a);
            }
            MutableStateFlow<Object> mutableStateFlow = this$0.f4660d.get(key);
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(mo313a);
            }
        }
    }

    public SavedStateHandle() {
        this.f4657a = new LinkedHashMap();
        this.f4658b = new LinkedHashMap();
        this.f4659c = new LinkedHashMap();
        this.f4660d = new LinkedHashMap();
        final int i2 = 0;
        this.f4661e = new SavedStateRegistry.SavedStateProvider(this) { // from class: androidx.lifecycle.a

            /* renamed from: b */
            public final /* synthetic */ SavedStateHandle f4703b;

            {
                this.f4703b = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            /* renamed from: a */
            public final Bundle mo313a() {
                switch (i2) {
                }
                return SavedStateHandle.m3232a(this.f4703b);
            }
        };
    }
}
