package com.yandex.div.core.experiments;

import kotlin.Metadata;

/* compiled from: Experiment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m31884d2 = {"Lcom/yandex/div/core/experiments/Experiment;", "", "TAP_BEACONS_ENABLED", "VISIBILITY_BEACONS_ENABLED", "LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED", "IGNORE_ACTION_MENU_ITEMS_ENABLED", "HYPHENATION_SUPPORT_ENABLED", "VISUAL_ERRORS_ENABLED", "ACCESSIBILITY_ENABLED", "VIEW_POOL_ENABLED", "VIEW_POOL_PROFILING_ENABLED", "RESOURCE_CACHE_ENABLED", "SHOW_RENDERING_TIME", "MULTIPLE_STATE_CHANGE_ENABLED", "BIND_ON_ATTACH_ENABLED", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum Experiment {
    TAP_BEACONS_ENABLED("tap_beacons_enabled", false, 2),
    VISIBILITY_BEACONS_ENABLED("visibility_beacons_enabled", false, 2),
    LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED("longtap_actions_pass_to_child", false, 2),
    IGNORE_ACTION_MENU_ITEMS_ENABLED("override_context_menu_handler", false, 2),
    HYPHENATION_SUPPORT_ENABLED("support_hyphenation", false, 2),
    VISUAL_ERRORS_ENABLED("visual_errors", false, 2),
    ACCESSIBILITY_ENABLED("accessibility_enabled", false, 2),
    VIEW_POOL_ENABLED("view_pool_enabled", true),
    VIEW_POOL_PROFILING_ENABLED("view_pool_profiling_enabled", false, 2),
    RESOURCE_CACHE_ENABLED("resource_cache_enabled", true),
    SHOW_RENDERING_TIME("demo_activity_rendering_time_enabled", false),
    MULTIPLE_STATE_CHANGE_ENABLED("multiple_state_change_enabled", false, 2),
    BIND_ON_ATTACH_ENABLED("bind_on_attach_enabled", false, 2);


    /* renamed from: b */
    public final boolean f31181b;

    Experiment(String str, boolean z) {
        this.f31181b = z;
    }

    Experiment(String str, boolean z, int i2) {
        this.f31181b = (i2 & 2) != 0 ? false : z;
    }
}
