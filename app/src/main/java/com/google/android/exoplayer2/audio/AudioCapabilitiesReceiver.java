package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import java.util.Objects;

/* loaded from: classes.dex */
public final class AudioCapabilitiesReceiver {

    public final class ExternalSurroundSoundSettingObserver extends ContentObserver {
        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            AudioCapabilities.m6109a(context, intent);
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public interface Listener {
    }
}
