//vars
public class Cndktor{
public float songBpm;

public float songPosition;

public float secPerBeat;

public float songBeatPosition;

public float displaySongTime;

public float firstBeatOffset;

 

// var for antall beats fra start av loopen 
    public float beatsPerLoop;

    public int completedLoops = 0;

    public float loopPositionInBeats;

    public float loopPositionInAnalog;

}

public static Conductor instance;

void Awake(){
    instance = this;

}




