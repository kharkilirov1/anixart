package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import p027e.C6281a;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$getComponents$0(ComponentContainer componentContainer) {
        TransportRuntime.m5522c((Context) componentContainer.get(Context.class));
        return TransportRuntime.m5521b().m5523d(CCTDestination.f8957e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component.Builder m12328a = Component.m12328a(TransportFactory.class);
        m12328a.m12333a(new Dependency(Context.class, 1, 0));
        m12328a.m12335c(C6281a.f58011c);
        return Arrays.asList(m12328a.m12334b(), LibraryVersionComponent.m12722a("fire-transport", "18.1.5"));
    }
}
