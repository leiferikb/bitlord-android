/*
 * 
 *
 * This file is part of BitLord.
 *
 * BitLord is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BitLord is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with BitLord.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.proninyaroslav.libretorrent.core.model.data;

public class ReadPieceInfo
{
    public int piece;
    public int size;
    public long bufferPtr;
    public Exception err;

    public ReadPieceInfo(int piece, int size, long bufferPtr, Exception err)
    {
        this.piece = piece;
        this.size = size;
        this.bufferPtr = bufferPtr;
        this.err = err;
    }

    @Override
    public String toString()
    {
        return "ReadPieceInfo{" +
                "piece=" + piece +
                ", size=" + size +
                ", bufferPtr=" + bufferPtr +
                ", err=" + err +
                '}';
    }
}
