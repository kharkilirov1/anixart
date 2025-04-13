package com.google.android.exoplayer2.ext.mediasession;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;

/* loaded from: classes.dex */
public final class TimelineQueueEditor implements MediaSessionConnector.QueueEditor, MediaSessionConnector.CommandReceiver {

    public interface MediaDescriptionConverter {
    }

    public interface MediaDescriptionEqualityChecker {
    }

    public static final class MediaIdEqualityChecker implements MediaDescriptionEqualityChecker {
    }

    public interface QueueDataAdapter {
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.CommandReceiver
    /* renamed from: g */
    public boolean mo6337g(Player player, String str, @Nullable Bundle bundle, @Nullable ResultReceiver resultReceiver) {
        if (!"exo_move_window".equals(str) || bundle == null) {
            return false;
        }
        int i2 = bundle.getInt("from_index", -1);
        int i3 = bundle.getInt("to_index", -1);
        if (i2 == -1 || i3 == -1) {
            return true;
        }
        throw null;
    }
}
