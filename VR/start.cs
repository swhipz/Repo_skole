void start ()
{  //Hent musikk og sett opp når sangen starter
    musicSource = GetComponent<Audiosource>();
    secPerBeat = 60f / sangBpm;
    displaySongTime = (float)AudioSettings.dspTime;
    musicSource.Play;



    // Animator-initialisering

    animator = GetComponent<Animator>();

    animatorStateInfo = animator.GetCurrentAnimatorStateInfo(0);

    currentState = animatorStateInfo.fullPathHash;

    

}