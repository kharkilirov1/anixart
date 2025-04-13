package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CreationExtras.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "Empty", "Key", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class CreationExtras {

    /* renamed from: a */
    @NotNull
    public final Map<Key<?>, Object> f4704a = new LinkedHashMap();

    /* compiled from: CreationExtras.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Empty extends CreationExtras {

        /* renamed from: b */
        @NotNull
        public static final Empty f4705b = new Empty();

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        @Nullable
        /* renamed from: a */
        public <T> T mo3249a(@NotNull Key<T> key) {
            return null;
        }
    }

    /* compiled from: CreationExtras.kt */
    @Metadata(m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m31884d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "T", "", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0}, m31888xi = 48)
    public interface Key<T> {
    }

    @Nullable
    /* renamed from: a */
    public abstract <T> T mo3249a(@NotNull Key<T> key);
}
