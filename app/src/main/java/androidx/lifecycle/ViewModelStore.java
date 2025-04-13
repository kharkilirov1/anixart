package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ViewModelStore {

    /* renamed from: a */
    public final HashMap<String, ViewModel> f4700a = new HashMap<>();

    /* renamed from: a */
    public final void m3247a() {
        for (ViewModel viewModel : this.f4700a.values()) {
            viewModel.f4687c = true;
            Map<String, Object> map = viewModel.f4685a;
            if (map != null) {
                synchronized (map) {
                    Iterator<Object> it = viewModel.f4685a.values().iterator();
                    while (it.hasNext()) {
                        ViewModel.m3242a(it.next());
                    }
                }
            }
            Set<Closeable> set = viewModel.f4686b;
            if (set != null) {
                synchronized (set) {
                    Iterator<Closeable> it2 = viewModel.f4686b.iterator();
                    while (it2.hasNext()) {
                        ViewModel.m3242a(it2.next());
                    }
                }
            }
            viewModel.mo3065b();
        }
        this.f4700a.clear();
    }
}
