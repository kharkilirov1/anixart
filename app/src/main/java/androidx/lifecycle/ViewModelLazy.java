package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: ViewModelLazy.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "Lkotlin/Lazy;", "lifecycle-viewmodel_release"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements Lazy<VM> {

    /* compiled from: ViewModelLazy.kt */
    @Metadata(m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras$Empty;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    /* renamed from: androidx.lifecycle.ViewModelLazy$1 */
    final class C04091 extends Lambda implements Function0<CreationExtras.Empty> {
        static {
            new C04091();
        }

        public C04091() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public CreationExtras.Empty invoke() {
            return CreationExtras.Empty.f4705b;
        }
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Objects.requireNonNull(null);
        throw null;
    }
}
