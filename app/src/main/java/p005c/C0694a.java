package p005c;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.ListenerSet;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.ProfilePreferenceFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: c.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0694a implements SynchronizationGuard.CriticalSection, ListenerSet.Event, Preference.OnPreferenceChangeListener {

    /* renamed from: b */
    public final /* synthetic */ Object f6834b;

    /* renamed from: c */
    public final /* synthetic */ Object f6835c;

    /* renamed from: d */
    public final /* synthetic */ Object f6836d;

    public /* synthetic */ C0694a(Object obj, Object obj2, Object obj3) {
        this.f6834b = obj;
        this.f6835c = obj2;
        this.f6836d = obj3;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeListener
    /* renamed from: a */
    public boolean mo3394a(Preference preference, Object obj) {
        ListPreference prefPrivacySocial = (ListPreference) this.f6834b;
        ListPreference prefPrivacyFriendRequests = (ListPreference) this.f6835c;
        ProfilePreferenceFragment this$0 = (ProfilePreferenceFragment) this.f6836d;
        KProperty<Object>[] kPropertyArr = ProfilePreferenceFragment.f28361t;
        Intrinsics.m32179h(prefPrivacySocial, "$prefPrivacySocial");
        Intrinsics.m32179h(prefPrivacyFriendRequests, "$prefPrivacyFriendRequests");
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(preference, "preference");
        int m3363R = prefPrivacySocial.m3363R(obj.toString());
        prefPrivacyFriendRequests.mo3342V(m3363R);
        this$0.m15548n4().m14798h(m3363R);
        return true;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        DefaultScheduler defaultScheduler = (DefaultScheduler) this.f6834b;
        TransportContext transportContext = (TransportContext) this.f6835c;
        defaultScheduler.f9253d.mo5582S0(transportContext, (EventInternal) this.f6836d);
        defaultScheduler.f9250a.mo5550a(transportContext, 1);
        return null;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).mo6037N((AnalyticsListener.EventTime) this.f6834b, (TrackGroupArray) this.f6835c, (TrackSelectionArray) this.f6836d);
    }
}
