    // regn ut hvor lenge siden ting startet
void update() {
    // hvor lenge siden det er sangen startet
    songPosition = (float)(AudioSettings.dspTime - displaySongTime - firstBeatOffset);

    // antall beats siden sangen starta
    songBeatPosition = songPosition / secPerBeat;
    
    //calculate the loop position
    if (songPositionInBeats >= (completedLoops + 1) * beatsPerLoop)
        completedLoops++;
    loopPositionInBeats = songPositionInBeats - completedLoops * beatsPerLoop;


    animator.Play(currentState, -1, (Conductor.instance.loopPositionInAnalog));

    animator.speed = 0;

    // NB: Husk å redigere tangentene i unity-animasjonen for å oppnå en "smooth" loop. 

    






}