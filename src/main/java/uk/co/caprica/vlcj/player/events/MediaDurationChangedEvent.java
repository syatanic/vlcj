/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2009-2018 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.player.events;

import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerEventListener;

/**
 *
 */
class MediaDurationChangedEvent extends AbstractMediaPlayerEvent {

    /**
     * Duration.
     */
    private final long newDuration;

    /**
     * Create a media player event.
     *
     * @param mediaPlayer media player the event relates to
     * @param newDuration duration
     */
    MediaDurationChangedEvent(MediaPlayer mediaPlayer, long newDuration) {
        super(mediaPlayer);
        this.newDuration = newDuration;
    }

    @Override
    public void notify(MediaPlayerEventListener listener) {
        listener.mediaDurationChanged(mediaPlayer, newDuration);
    }
}
